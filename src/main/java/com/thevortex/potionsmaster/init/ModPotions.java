package com.thevortex.potionsmaster.init;

import com.thevortex.potionsmaster.reference.Reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;


public class ModPotions {
    public static final MobEffectInstance COALSIGHT = new MobEffectInstance(ModRegistry.COALSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance IRONSIGHT = new MobEffectInstance(ModRegistry.IRONSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance REDSTONESIGHT = new MobEffectInstance(ModRegistry.REDSTONESIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance LAPISSIGHT = new MobEffectInstance(ModRegistry.LAPISSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance GOLDSIGHT = new MobEffectInstance(ModRegistry.GOLDSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance DIAMONDSIGHT = new MobEffectInstance(ModRegistry.DIAMONDSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance EMERALDSIGHT = new MobEffectInstance(ModRegistry.EMERALDSIGHT, 6000, 0, false, true, true);

    public static final MobEffectInstance ALUMINIUMSIGHT = new MobEffectInstance(ModRegistry.ALUMINIUMSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance COPPERSIGHT = new MobEffectInstance(ModRegistry.COPPERSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance TINSIGHT = new MobEffectInstance(ModRegistry.TINSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance NICKELSIGHT = new MobEffectInstance(ModRegistry.NICKELSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance URANIUMSIGHT = new MobEffectInstance(ModRegistry.URANIUMSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance LEADSIGHT = new MobEffectInstance(ModRegistry.LEADSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance SILVERSIGHT = new MobEffectInstance(ModRegistry.SILVERSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance ZINCSIGHT = new MobEffectInstance(ModRegistry.ZINCSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance OSMIUMSIGHT = new MobEffectInstance(ModRegistry.OSMIUMSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance QUARTZSIGHT = new MobEffectInstance(ModRegistry.QUARTZSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance BISMUTHSIGHT = new MobEffectInstance(ModRegistry.BISMUTHSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance CRIMSONIRONSIGHT = new MobEffectInstance(ModRegistry.CRIMSONIRONSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance PLATINUMSIGHT = new MobEffectInstance(ModRegistry.PLATINUMSIGHT, 6000, 0, false, true, true);
    public static final MobEffectInstance NETHERITESIGHT = new MobEffectInstance(ModRegistry.NETHERITESIGHT, 6000, 0, false, true, true);

    public static final MobEffectInstance ALLTHEMODIUMSIGHT = new MobEffectInstance(ModRegistry.ALLTHEMODIUMSIGHT, 3000, 0, false, true, true);
    public static final MobEffectInstance VIBRANIUMSIGHT = new MobEffectInstance(ModRegistry.VIBRANIUMSIGHT, 3000, 0, false, true, true);
    public static final MobEffectInstance UNOBTAINIUMSIGHT = new MobEffectInstance(ModRegistry.UNOBTAINIUMSIGHT, 3000, 0, false, true, true);


    public static final Potion COAL_SIGHT = new Potion("coal_sight", COALSIGHT);
    public static final Potion IRON_SIGHT = new Potion("iron_sight", IRONSIGHT);
    public static final Potion REDSTONE_SIGHT = new Potion("redstone_sight", REDSTONESIGHT);
    public static final Potion LAPIS_SIGHT = new Potion("lapis_sight", LAPISSIGHT);
    public static final Potion GOLD_SIGHT = new Potion("gold_sight", GOLDSIGHT);
    public static final Potion DIAMOND_SIGHT = new Potion("diamond_sight", DIAMONDSIGHT);
    public static final Potion EMERALD_SIGHT = new Potion("emerald_sight", EMERALDSIGHT);

    public static final Potion ALUMINIUM_SIGHT = new Potion("aluminium_sight", ALUMINIUMSIGHT);
    public static final Potion COPPER_SIGHT = new Potion("copper_sight", COPPERSIGHT);
    public static final Potion TIN_SIGHT = new Potion("tin_sight", TINSIGHT);
    public static final Potion NICKEL_SIGHT = new Potion("nickel_sight", NICKELSIGHT);
    public static final Potion URANIUM_SIGHT = new Potion("uranium_sight", URANIUMSIGHT);
    public static final Potion LEAD_SIGHT = new Potion("lead_sight", LEADSIGHT);
    public static final Potion SILVER_SIGHT = new Potion("silver_sight", SILVERSIGHT);
    public static final Potion ZINC_SIGHT = new Potion("zinc_sight", ZINCSIGHT);
    public static final Potion OSMIUM_SIGHT = new Potion("osmium_sight", OSMIUMSIGHT);


    public static final Potion QUARTZ_SIGHT = new Potion("quartz_sight", QUARTZSIGHT);
    public static final Potion BISMUTH_SIGHT = new Potion("bismuth_sight", BISMUTHSIGHT);
    public static final Potion CRIMSONIRON_SIGHT = new Potion("crimsoniron_sight", CRIMSONIRONSIGHT);
    public static final Potion PLATINUM_SIGHT = new Potion("platinum_sight", PLATINUMSIGHT);
    public static final Potion NETHERITE_SIGHT = new Potion("netherite_sight", NETHERITESIGHT);
    public static final Potion ALLTHEMODIUM_SIGHT = new Potion("allthemodium_sight", ALLTHEMODIUMSIGHT);
    public static final Potion VIBRANIUM_SIGHT = new Potion("vibranium_sight", VIBRANIUMSIGHT);
    public static final Potion UNOBTAINIUM_SIGHT = new Potion("unobtainium_sight", UNOBTAINIUMSIGHT);


    private static ResourceLocation location(String name) {
        return ResourceLocation.fromNamespaceAndPath(Reference.MOD_ID, name);
    }

}
