package com.thevortex.potionsmaster.items.potions.effect.oresight;

import com.thevortex.potionsmaster.PotionsMaster;
import com.thevortex.potionsmaster.render.util.BlockData;
import com.thevortex.potionsmaster.render.util.BlockStore;
import com.thevortex.potionsmaster.render.util.BlockStore.BlockDataWithUUID;
import com.thevortex.potionsmaster.render.util.xray.Controller;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

public class OreSightEffect extends MobEffect {
    protected String effectType;
    public OreSightEffect(MobEffectCategory typeIn, String effectType, int liquidColorIn) {
        super(typeIn, liquidColorIn);
        this.effectType = effectType;
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {

        return duration > 0;
    }

    public String getEffectType(){
        return this.effectType;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public boolean applyEffectTick(LivingEntity entityLivingBaseIn, int amplifier) {
        BlockStore store = PotionsMaster.blockStore;
        if ((entityLivingBaseIn instanceof LocalPlayer)) {

                BlockDataWithUUID bdUUID = store.getStoreByReference(this.effectType);
                BlockData oreSight = bdUUID.getBlockData();
                if (!oreSight.isDrawing() /*&& entityLivingBaseIn.getEffect(this) != null TODO: Check can probably get removed*/) {
                    oreSight.setDrawing(true);
                    if (!Controller.drawOres()) {
                        Controller.toggleDrawOres();
                    }
                }
            }
            return super.applyEffectTick(entityLivingBaseIn, amplifier);

    }


}
