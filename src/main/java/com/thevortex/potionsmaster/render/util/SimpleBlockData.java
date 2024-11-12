package com.thevortex.potionsmaster.render.util;

import com.thevortex.potionsmaster.render.util.OutlineColor;

public class SimpleBlockData {

    private String name;
    private String oreTag;
    private int order;

    private int color;
    private boolean drawing;

    public SimpleBlockData(String name, String oreTag, int color, boolean drawing, int order) {
        this.name = name;
        this.oreTag = oreTag;
        this.color = color;
        this.drawing = drawing;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public String getoreTag() {
        return oreTag;
    }

    public int getColor() {
        return color;
    }

    public boolean isDrawing() {
        return drawing;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
