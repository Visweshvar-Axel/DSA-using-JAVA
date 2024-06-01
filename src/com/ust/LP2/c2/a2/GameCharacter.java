package com.ust.LP2.c2.a2;

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
}
