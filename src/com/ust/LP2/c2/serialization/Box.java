package com.ust.LP2.c2.serialization;

import java.io.Serializable;

public class Box implements Serializable {

    private int width;
    private int height;

    public Box(){}

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setHeight(100);
        box.setWidth(200);
    }
}
