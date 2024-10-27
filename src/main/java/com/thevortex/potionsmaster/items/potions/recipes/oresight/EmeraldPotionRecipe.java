package com.thevortex.potionsmaster.items.potions.recipes.oresight;


import com.thevortex.potionsmaster.init.ModRegistry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.brewing.BrewingRecipe;


public class EmeraldPotionRecipe extends BrewingRecipe {


    public EmeraldPotionRecipe(Ingredient input, Ingredient ingredient, ItemStack output) {
        super(input, ingredient, output);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isInput(ItemStack input) {
        PotionContents potioncontents = input.getOrDefault(DataComponents.POTION_CONTENTS, PotionContents.EMPTY);
        return potioncontents.is(Potions.MUNDANE);
    }

    @Override
    public boolean isIngredient(ItemStack ingredient) {
        // TODO Auto-generated method stub
        return (ingredient.getItem().asItem() == ModRegistry.CALCINATEDEMERALD_POWDER.get());
    }

    @Override
    public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
        return isInput(input) && isIngredient(ingredient) ? getOutput().copy() : ItemStack.EMPTY;

    }

    public ItemStack getOutput() {
        ItemStack itemstack = new ItemStack(Items.POTION);
        itemstack.set(DataComponents.POTION_CONTENTS, new PotionContents(ModRegistry.EMERALD_SIGHT));
        return itemstack;
    }

}

