package com.ust.LP2.c2.a2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameSaverLoader {
    public static void gameSave(GameCharacter[] objs){
        try {
            FileOutputStream file = new FileOutputStream("GameData.ser");
            ObjectOutputStream ob = new ObjectOutputStream(file);
            for (GameCharacter ch: objs) ob.writeObject(ch);
            ob.close();
        } catch (Exception e) {e.printStackTrace();}
    }
    public static GameCharacter[] gatGameChar(int num){
        GameCharacter[] objs = new GameCharacter[num];
        try {
            FileInputStream file = new  FileInputStream("GameData.ser");
            ObjectInputStream ob = new ObjectInputStream(file);
            for (int i = 0;i < num;i++) objs[i] = (GameCharacter) ob.readObject();
            ob.close();
        } catch (Exception e) {e.printStackTrace();}
        return objs;
    }
    public static void main(String[] args) {
        GameCharacter[] gameChar = new GameCharacter[]{
                new GameCharacter(50,"Viswa","Gold",new String[]{"bare", "bomb"}),
                new GameCharacter(150,"Axel","Silver",new String[]{"bow", "arrow","bomb"})
        };
        gameSave(gameChar);
        gameChar[0] = gameChar[1] = null;
        GameCharacter[] newGameChar = gatGameChar(gameChar.length);
        for (GameCharacter ch : newGameChar) System.out.println(ch.toString());
    }
}
