package com.thevortex.potionsmaster.init;

import com.thevortex.potionsmaster.blocks.Mortar;
import com.thevortex.potionsmaster.items.Bezoar;
import com.thevortex.potionsmaster.items.GallBladder;
import com.thevortex.potionsmaster.items.Pestle;
import com.thevortex.potionsmaster.items.potions.effect.oresight.OreSightEffect;
import com.thevortex.potionsmaster.items.powders.base.BasePowder;
import com.thevortex.potionsmaster.items.powders.base.CalcinatedPowder;
import com.thevortex.potionsmaster.items.powders.calcinated.ActivatedCharcoal;
import com.thevortex.potionsmaster.reference.Ores;
import com.thevortex.potionsmaster.reference.Reference;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Reference.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Reference.MOD_ID);
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(Registries.POTION, Reference.MOD_ID);
    public static final DeferredRegister<MobEffect> MOBEFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, Reference.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reference.MOD_ID);



    // Block(s?)
    public static final DeferredBlock<Mortar> MORTAR = BLOCKS.register("tile_mortar", () -> new Mortar());

    // Items

    public static final DeferredItem<BasePowder> CHARCOAL_POWDER = ITEMS.register("charcoal_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> COAL_POWDER = ITEMS.register("coal_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> DIAMOND_POWDER = ITEMS.register("diamond_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> EMERALD_POWDER = ITEMS.register("emerald_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> GOLD_POWDER = ITEMS.register("gold_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> IRON_POWDER = ITEMS.register("iron_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> LAPIS_POWDER = ITEMS.register("lapis_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> REDSTONE_POWDER  = ITEMS.register("redstone_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> ALUMINIUM_POWDER = ITEMS.register("aluminium_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> COPPER_POWDER = ITEMS.register("copper_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> TIN_POWDER = ITEMS.register("tin_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> NICKEL_POWDER = ITEMS.register("nickel_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> URANIUM_POWDER = ITEMS.register("uranium_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> LEAD_POWDER = ITEMS.register("lead_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> SILVER_POWDER = ITEMS.register("silver_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> ZINC_POWDER = ITEMS.register("zinc_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> OSMIUM_POWDER = ITEMS.register("osmium_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> QUARTZ_POWDER = ITEMS.register("quartz_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> BISMUTH_POWDER = ITEMS.register("bismuth_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> CRIMSONIRON_POWDER = ITEMS.register("crimsoniron_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> PLATINUM_POWDER = ITEMS.register("platinum_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> ALLTHEMODIUM_POWDER = ITEMS.register("allthemodium_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> VIBRANIUM_POWDER = ITEMS.register("vibranium_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> UNOBTAINIUM_POWDER = ITEMS.register("unobtainium_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<BasePowder> NETHERITE_POWDER = ITEMS.register("netherite_powder", () -> new BasePowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDCOAL_POWDER = ITEMS.register("calcinatedcoal_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDDIAMOND_POWDER = ITEMS.register("calcinateddiamond_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDEMERALD_POWDER = ITEMS.register("calcinatedemerald_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDGOLD_POWDER = ITEMS.register("calcinatedgold_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDIRON_POWDER = ITEMS.register("calcinatediron_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDLAPIS_POWDER = ITEMS.register("calcinatedlapis_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDREDSTONE_POWDER = ITEMS.register("calcinatedredstone_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDNETHERITE_POWDER = ITEMS.register("calcinatednetherite_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDALUMINIUM_POWDER = ITEMS.register("calcinatedaluminium_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDCOPPER_POWDER = ITEMS.register("calcinatedcopper_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDTIN_POWDER = ITEMS.register("calcinatedtin_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDNICKEL_POWDER = ITEMS.register("calcinatednickel_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDURANIUM_POWDER = ITEMS.register("calcinateduranium_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDLEAD_POWDER = ITEMS.register("calcinatedlead_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDSILVER_POWDER = ITEMS.register("calcinatedsilver_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDZINC_POWDER = ITEMS.register("calcinatedzinc_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDOSMIUM_POWDER = ITEMS.register("calcinatedosmium_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDQUARTZ_POWDER = ITEMS.register("calcinatedquartz_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDBISMUTH_POWDER = ITEMS.register("calcinatedbismuth_powder", () -> new CalcinatedPowder(new Item.Properties()));
    public static final DeferredItem<CalcinatedPowder> CALCINATEDCRIMSONIRON_POWDER = ITEMS.register("calcinatedcrimsoniron_powder", () -> new CalcinatedPowder(new Item.Properties()));;
    public static final DeferredItem<CalcinatedPowder> CALCINATEDPLATINUM_POWDER = ITEMS.register("calcinatedplatinum_powder", () -> new CalcinatedPowder(new Item.Properties()));;
    public static final DeferredItem<CalcinatedPowder> CALCINATEDALLTHEMODIUM_POWDER = ITEMS.register("calcinatedallthemodium_powder", () -> new CalcinatedPowder(new Item.Properties()));;
    public static final DeferredItem<CalcinatedPowder> CALCINATEDVIBRANIUM_POWDER = ITEMS.register("calcinatedvibranium_powder", () -> new CalcinatedPowder(new Item.Properties()));;
    public static final DeferredItem<CalcinatedPowder> CALCINATEDUNOBTAINIUM_POWDER = ITEMS.register("calcinatedunobtainium_powder", () -> new CalcinatedPowder(new Item.Properties()));;
    public static final DeferredItem<BasePowder> ENDER_POWDER = ITEMS.register("ender_powder", () ->  new BasePowder(new Item.Properties()));


    public static final DeferredItem<Bezoar> BEZOAR = ITEMS.register("bezoar",() -> new Bezoar(new Item.Properties().food(ModFoods.BEZOAR)));
    public static final DeferredItem<GallBladder> GALLBLADDER = ITEMS.register("gallbladder",() -> new GallBladder(new Item.Properties().food(ModFoods.GALLBLADDER)));
    public static final DeferredItem<ActivatedCharcoal> ACTIVATEDCHARCOAL = ITEMS.register("activated_charcoal", () -> new ActivatedCharcoal(new Item.Properties().food(ModFoods.ACTIVATEDCHARCOAL)));
    public static final DeferredItem<Pestle> PESTLE = ITEMS.register("pestle",() -> new Pestle(new Item.Properties()));

    public static final DeferredItem<com.thevortex.potionsmaster.items.Mortar> ITEM_MORTAR = ITEMS.register("tile_mortar",() -> new com.thevortex.potionsmaster.items.Mortar(MORTAR.get(), new Item.Properties()));

    // Potions

    public static final DeferredHolder<Potion, Potion> COAL_SIGHT = POTIONS.register("coal_sight",  () -> ModPotions.COAL_SIGHT);
    public static final DeferredHolder<Potion, Potion> IRON_SIGHT = POTIONS.register("iron_sight", () -> ModPotions.IRON_SIGHT);
    public static final DeferredHolder<Potion, Potion> REDSTONE_SIGHT = POTIONS.register("redstone_sight", () -> ModPotions.REDSTONE_SIGHT);
    public static final DeferredHolder<Potion, Potion> LAPIS_SIGHT = POTIONS.register("lapis_sight" ,() -> ModPotions.LAPIS_SIGHT);
    public static final DeferredHolder<Potion, Potion> GOLD_SIGHT = POTIONS.register("gold_sight",() -> ModPotions.GOLD_SIGHT);
    public static final DeferredHolder<Potion, Potion> DIAMOND_SIGHT = POTIONS.register("diamond_sight",() -> ModPotions.DIAMOND_SIGHT);
    public static final DeferredHolder<Potion, Potion> EMERALD_SIGHT = POTIONS.register("emerald_sight",() -> ModPotions.EMERALD_SIGHT);

    public static final DeferredHolder<Potion, Potion> ALUMINIUM_SIGHT = POTIONS.register("aluminum_sight",() -> ModPotions.ALUMINIUM_SIGHT);
    public static final DeferredHolder<Potion, Potion> COPPER_SIGHT  = POTIONS.register("copper_sight",() -> ModPotions.COPPER_SIGHT);
    public static final DeferredHolder<Potion, Potion> TIN_SIGHT = POTIONS.register("tin_sight",() -> ModPotions.TIN_SIGHT);
    public static final DeferredHolder<Potion, Potion> NICKEL_SIGHT = POTIONS.register("nickel_sight",() -> ModPotions.NICKEL_SIGHT);
    public static final DeferredHolder<Potion, Potion> URANIUM_SIGHT = POTIONS.register("uranium_sight",() -> ModPotions.URANIUM_SIGHT);
    public static final DeferredHolder<Potion, Potion> LEAD_SIGHT = POTIONS.register("lead_sight",() -> ModPotions.LEAD_SIGHT);
    public static final DeferredHolder<Potion, Potion> SILVER_SIGHT = POTIONS.register("silver_sight",() -> ModPotions.SILVER_SIGHT);
    public static final DeferredHolder<Potion, Potion> ZINC_SIGHT = POTIONS.register("zinc_sight",() -> ModPotions.ZINC_SIGHT);
    public static final DeferredHolder<Potion, Potion> OSMIUM_SIGHT = POTIONS.register("osmium_sight",() -> ModPotions.OSMIUM_SIGHT);
    public static final DeferredHolder<Potion, Potion> QUARTZ_SIGHT = POTIONS.register("quartz_sight",() -> ModPotions.QUARTZ_SIGHT);
    public static final DeferredHolder<Potion, Potion> BISMUTH_SIGHT = POTIONS.register("bismuth_sight",() -> ModPotions.BISMUTH_SIGHT);
    public static final DeferredHolder<Potion, Potion> CRIMSONIRON_SIGHT = POTIONS.register("crimsoniron_sight",() -> ModPotions.CRIMSONIRON_SIGHT);
    public static final DeferredHolder<Potion, Potion> PLATINUM_SIGHT = POTIONS.register("platinum_sight",() -> ModPotions.PLATINUM_SIGHT);
    public static final DeferredHolder<Potion, Potion> NETHERITE_SIGHT = POTIONS.register("netherite_sight",() -> ModPotions.NETHERITE_SIGHT);
    public static final DeferredHolder<Potion, Potion> ALLTHEMODIUM_SIGHT = POTIONS.register("allthemodium_sight",() -> ModPotions.ALLTHEMODIUM_SIGHT);
    public static final DeferredHolder<Potion, Potion> VIBRANIUM_SIGHT = POTIONS.register("vibranium_sight",() -> ModPotions.VIBRANIUM_SIGHT);
    public static final DeferredHolder<Potion, Potion> UNOBTAINIUM_SIGHT = POTIONS.register("unobtainium_sight",() -> ModPotions.UNOBTAINIUM_SIGHT);


    // Mob Effects

    public static DeferredHolder<MobEffect, MobEffect> COALSIGHT = MOBEFFECTS.register("coalpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.COAL.toString(), 65793));
    public static DeferredHolder<MobEffect, MobEffect> IRONSIGHT= MOBEFFECTS.register("ironpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.IRON.toString(), 14991530));
    public static DeferredHolder<MobEffect, MobEffect> REDSTONESIGHT= MOBEFFECTS.register("redstonepotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.REDSTONE.toString() ,16711680));
    public static DeferredHolder<MobEffect, MobEffect> LAPISSIGHT= MOBEFFECTS.register("lapispotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.LAPIS.toString(), 658175));
    public static DeferredHolder<MobEffect, MobEffect> GOLDSIGHT= MOBEFFECTS.register("goldpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.GOLD.toString(),13938487));
    public static DeferredHolder<MobEffect, MobEffect> DIAMONDSIGHT= MOBEFFECTS.register("diamondpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.DIAMOND.toString(),4053987));
    public static DeferredHolder<MobEffect, MobEffect> EMERALDSIGHT= MOBEFFECTS.register("emeraldpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.EMERALD.toString(),65280));

    public static DeferredHolder<MobEffect, MobEffect> ALUMINIUMSIGHT= MOBEFFECTS.register("aluminiumpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.ALUMINIUM.toString(),14935011));
    public static DeferredHolder<MobEffect, MobEffect> COPPERSIGHT= MOBEFFECTS.register("copperpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.COPPER.toString(),12021818));
    public static DeferredHolder<MobEffect, MobEffect> TINSIGHT= MOBEFFECTS.register("tinpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.TIN.toString(),7895160));
    public static DeferredHolder<MobEffect, MobEffect> NICKELSIGHT= MOBEFFECTS.register("nickelpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.NICKEL.toString(),11118980));
    public static DeferredHolder<MobEffect, MobEffect> URANIUMSIGHT= MOBEFFECTS.register("uraniumpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.URANIUM.toString(),8316792));
    public static DeferredHolder<MobEffect, MobEffect> LEADSIGHT= MOBEFFECTS.register("leadpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.LEAD.toString(),8162502));
    public static DeferredHolder<MobEffect, MobEffect> SILVERSIGHT= MOBEFFECTS.register("silverpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.SILVER.toString(),10805479));
    public static DeferredHolder<MobEffect, MobEffect> ZINCSIGHT= MOBEFFECTS.register("zincpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.ZINC.toString(),11908469));
    public static DeferredHolder<MobEffect, MobEffect> OSMIUMSIGHT= MOBEFFECTS.register("osmiumpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.OSMIUM.toString(),12634589));
    public static DeferredHolder<MobEffect, MobEffect> QUARTZSIGHT= MOBEFFECTS.register("quartzpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.QUARTZ.toString(),8162502));
    public static DeferredHolder<MobEffect, MobEffect> BISMUTHSIGHT= MOBEFFECTS.register("bismuthpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.BISMUTH.toString(),10805479));
    public static DeferredHolder<MobEffect, MobEffect> CRIMSONIRONSIGHT= MOBEFFECTS.register("crimsonironpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.CRIMSONIRON.toString(),11908469));
    public static DeferredHolder<MobEffect, MobEffect> PLATINUMSIGHT= MOBEFFECTS.register("platinumpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.PLATINUM.toString(),12634589));
    public static DeferredHolder<MobEffect, MobEffect> NETHERITESIGHT= MOBEFFECTS.register("netheritepotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.NETHERITE.toString(),16753920));
    public static DeferredHolder<MobEffect, MobEffect> ALLTHEMODIUMSIGHT= MOBEFFECTS.register("allthemodiumpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.ALLTHEMODIUM.toString(), 16701786));
    public static DeferredHolder<MobEffect, MobEffect> VIBRANIUMSIGHT= MOBEFFECTS.register("vibraniumpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.VIBRANIUM.toString(),2547336));
    public static DeferredHolder<MobEffect, MobEffect> UNOBTAINIUMSIGHT= MOBEFFECTS.register("unobtainiumpotioneffect", () -> new OreSightEffect(MobEffectCategory.BENEFICIAL, Ores.UNOBTAINIUM.toString(),13718243));


    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVE_TAB = CREATIVE_TABS.register("creative_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable(Reference.tab()))
            .icon(() -> Items.BREWING_STAND.getDefaultInstance())
            .displayItems((parameters, output) -> ITEMS.getEntries().stream()
                    .map(DeferredHolder::get)
                    .map(Item::getDefaultInstance)
                    .forEach(output::accept))
            .build()
    );

}