package com.ust.LP2.c2.serialization;

import java.io.Serializable;

public class GameCharacter implements Serializable {

    private int power;
    private String type;
    private String[] weapons;

    public GameCharacter(){}

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {
        String weaponList = "";
        for(String s : weapons) weaponList+=s;
        return weaponList;
    }
}
