package com.ust.LP2.c2.a2;

import java.util.Arrays;

public class GameCharacter {
    private int level;
    private String name;
    private String achievements;
    private String[] inventory;

    public GameCharacter(int level, String name, String achievements, String[] inventory) {
        this.level = level;
        this.name = name;
        this.achievements = achievements;
        this.inventory = inventory;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getAchievements() {
        return achievements;
    }

    public String[] getInventory() {
        return inventory;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", achievements='" + achievements + '\'' +
                ", inventory=" + Arrays.toString(inventory) +
                '}';
    }
}
