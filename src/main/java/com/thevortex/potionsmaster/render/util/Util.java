package com.thevortex.potionsmaster.render.util;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import org.joml.Matrix4f;

public class Util {
    public static float[] getComponents(int color) {
        float[] f = new float[4];
        f[0] = (float) ((color >> 16) & 0xFF)/255f;
        f[1] = (float) ((color >> 8) & 0xFF)/255f;
        f[2] = (float) (color & 0xFF)/255f;
        f[3] = (float) ((color >> 24) & 0xff)/255f;

        return f;
    }

    public static void renderBlock(PoseStack stack, VertexConsumer buffer, BlockInfo blockinfo) {
        if (blockinfo == null)
            return;
        final float size = 1.0f;
        float[] color = getComponents(blockinfo.color);
        float red = color[0];
        float green = color[1];
        float blue = color[2];
//        float opacity = (float)blockinfo.alpha;
        float opacity = 1.0f;
        float x = blockinfo.getX();
        float y = blockinfo.getY();
        float z = blockinfo.getZ();

        Matrix4f matrix4f = stack.last().pose();
        // top
        buffer.addVertex(matrix4f,x, y + size, z).setColor(red, green, blue, opacity);
        buffer.addVertex(matrix4f,x + size, y + size, z).setColor(red, green, blue, opacity);
        buffer.addVertex(matrix4f,x + size, y + size, z).setColor(red, green, blue, opacity);
        buffer.addVertex(matrix4f,x + size, y + size, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(matrix4f,x + size, y + size, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(matrix4f,x, y + size, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(matrix4f,x, y + size, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(matrix4f,x, y + size, z).setColor(red, green, blue, opacity);

        // bottom
        buffer.addVertex(x + size, y, z).setColor(red, green, blue, opacity);
        buffer.addVertex(x + size, y, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(x + size, y, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(x, y, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(x, y, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(x, y, z).setColor(red, green, blue, opacity);
        buffer.addVertex(x, y, z).setColor(red, green, blue, opacity);
        buffer.addVertex(x + size, y, z).setColor(red, green, blue, opacity);

        // side 1
        buffer.addVertex(x + size, y, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(x + size, y + size, z + size).setColor(red, green, blue, opacity);

        // side 2
        buffer.addVertex(x + size, y, z).setColor(red, green, blue, opacity);
        buffer.addVertex(x + size, y + size, z).setColor(red, green, blue, opacity);

        // side 3
        buffer.addVertex(x, y, z + size).setColor(red, green, blue, opacity);
        buffer.addVertex(x, y + size, z + size).setColor(red, green, blue, opacity);

        // side 4
        buffer.addVertex(x, y, z).setColor(red, green, blue, opacity);
        buffer.addVertex(x, y + size, z).setColor(red, green, blue, opacity);
    }


}
