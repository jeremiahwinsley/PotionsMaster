package com.thevortex.potionsmaster.render.util.xray;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.thevortex.potionsmaster.render.util.BlockInfo;
import com.thevortex.potionsmaster.render.util.Util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import org.lwjgl.opengl.GL11;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;


public class Render {
    public static class OreList {
        protected List<BlockInfo> oreList = Collections.synchronizedList(new ArrayList<>());

        public void add(BlockInfo info) {
            oreList.add(info);
            INSTANCE.dataAvailable.set(true);
        }

        public void remove(BlockInfo info) {
            oreList.remove(info);
            INSTANCE.dataAvailable.set(true);
        }

        public boolean isEmpty() {
            return oreList.isEmpty();
        }

        public void clear() {
            oreList.clear();
            INSTANCE.dataAvailable.set(true);
        }

        public void addAll(Collection<? extends BlockInfo> list) {
            oreList.addAll(list);
            INSTANCE.dataAvailable.set(true);
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static final Render INSTANCE = new Render();

    private static RenderType XRAY_TYPE = null;
    private VertexBuffer vertexBuf = null;
    private final AtomicBoolean dataAvailable = new AtomicBoolean(false);
    public static OreList ores = new OreList();

    public static RenderType buildRenderType() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        var compositeState = RenderType.CompositeState.builder()
                .setShaderState(new RenderStateShard.ShaderStateShard(GameRenderer::getRendertypeLinesShader))
                //.setDepthTestState(new RenderStateShard.DepthTestStateShard("always",GL11.GL_ALWAYS))
                .setCullState(new RenderStateShard.CullStateShard(false))
                .setTransparencyState(new RenderStateShard.TransparencyStateShard("xray",() -> {
                    RenderSystem.enableBlend();
                    RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                },() ->{
                    RenderSystem.disableBlend();
                })).createCompositeState(true);

        return RenderType.create("xray",DefaultVertexFormat.POSITION_COLOR,VertexFormat.Mode.DEBUG_LINES,512,false,false,compositeState);

    }

    @OnlyIn(Dist.CLIENT)
    public synchronized void rebuildBuffer() {
        var stack = new PoseStack();
        var tesselator = new Tesselator(XRAY_TYPE.bufferSize() * ores.oreList.size());
        var builder = tesselator.begin(XRAY_TYPE.mode(), XRAY_TYPE.format());
        for (var b : ores.oreList) {
            if (b != null) {
                renderShape(stack,builder,Shapes.block(),b.getX(),b.getY(),b.getZ(),
                        b.color);
            }
        }
        var vbuf = new VertexBuffer(VertexBuffer.Usage.DYNAMIC);
        vbuf.bind();
        vbuf.upload(builder.build());

        if (vertexBuf != null) vertexBuf.close();
        vertexBuf = vbuf;
        VertexBuffer.unbind();
    }

    @OnlyIn(Dist.CLIENT)
    public void drawOres(RenderLevelStageEvent event) {

        if (XRAY_TYPE == null) {
            try {
                XRAY_TYPE = buildRenderType();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (dataAvailable.get()) {
            rebuildBuffer();
            dataAvailable.set(false);
        }
        if (vertexBuf == null) return;

        Minecraft thisInstance = Minecraft.getInstance();

        Vec3 view = thisInstance.gameRenderer.getMainCamera().getPosition();

        PoseStack stack = event.getPoseStack();

        stack.pushPose();
        RenderSystem.applyModelViewMatrix();
        RenderSystem.depthFunc(GL11.GL_ALWAYS);
        stack.mulPose(event.getModelViewMatrix());
        stack.translate(-view.x,-view.y,-view.z);
        Profile.BLOCKS.apply(); // Sets GL state for block drawing

        RenderSystem.setShader(GameRenderer::getPositionColorShader);
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        vertexBuf.bind();
        
        ShaderInstance thisRenderer =  GameRenderer.getPositionColorShader() ;
        assert thisRenderer != null;
        thisRenderer.COLOR_MODULATOR.set(0.0f);

        vertexBuf.drawWithShader(stack.last().pose(), event.getProjectionMatrix(),RenderSystem.getShader());

        VertexBuffer.unbind();
        RenderSystem.depthFunc(GL11.GL_LEQUAL);
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(true);

        stack.popPose();
        RenderSystem.applyModelViewMatrix();
        Profile.BLOCKS.clean();
    }
    public static void renderShape(PoseStack pose, VertexConsumer vcon, VoxelShape shape, double x, double y, double z, int color) {
        PoseStack.Pose posestack$pose = pose.last();
        float[] col = Util.getComponents(color);

        shape.forAllEdges((x1, y1, z1, x2, y2, z2) -> {
            float f = (float)(x2 - x1);
            float f1 = (float)(y2 - y1);
            float f2 = (float)(z2 - z1);
            float f3 = Mth.sqrt(f * f + f1 * f1 + f2 * f2);
            f = f / f3;
            f1 = f1 / f3;
            f2 = f2 / f3;
            vcon.addVertex(posestack$pose, (float)(x1 + x), (float)(y1 + y), (float)(z1 + z)).setColor(col[0], col[1], col[2], col[3]).setNormal(f, f1, f2);
            vcon.addVertex(posestack$pose, (float)(x2 + x), (float)(y2 + y), (float)(z2 + z)).setColor(col[0], col[1], col[2], col[3]).setNormal(f, f1, f2);

        });
    }


    /**
     * OpenGL Profiles used for rendering blocks and entities
     */
    @OnlyIn(Dist.CLIENT)
    private enum Profile {
        BLOCKS {
            @Override
            public void apply() {
                GL11.glEnable(GL11.GL_BLEND);
                GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                GL11.glEnable(GL11.GL_LINE_SMOOTH);
                GL11.glDisable(GL11.GL_DEPTH_TEST);
                RenderSystem.lineWidth(6.0f);



            }

            @Override
            public void clean() {
                GL11.glEnable(GL11.GL_DEPTH_TEST);
                GL11.glDisable(GL11.GL_BLEND);
                GL11.glDisable(GL11.GL_LINE_SMOOTH);
            }
        },
        ENTITIES {
            @Override
            public void apply() {

            }

            @Override
            public void clean() {

            }
        };

        Profile() {
        }

        public abstract void apply();

        public abstract void clean();
    }

}
