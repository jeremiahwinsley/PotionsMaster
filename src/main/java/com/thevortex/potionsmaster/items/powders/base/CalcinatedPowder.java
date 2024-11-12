package com.thevortex.potionsmaster.items.powders.base;

import net.minecraft.world.item.Item;

public class CalcinatedPowder extends Item {
    protected final int color;
    public CalcinatedPowder(int color,Properties properties) {
        super(properties);
        this.color = color;
    }
    public int getColor() {
        return this.color;
    }
}
