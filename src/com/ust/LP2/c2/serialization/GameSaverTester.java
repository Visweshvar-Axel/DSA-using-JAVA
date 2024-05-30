package com.ust.LP2.c2.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameSaverTester {
    public static void main(String[] args) {
        // create three objects of GameCharacter class
        GameCharacter one = new GameCharacter(50,"Viswa",new String[]{"bare", "bomb"});
        GameCharacter two = new GameCharacter(200,"axel",new String[]{"bow", "arrow","bomb"});
        GameCharacter three = new GameCharacter(120,"anu",new String[]{"knife", "rope"});
        //serializing the objects
        try {
            // 1 create the connection stream
            FileOutputStream file = new FileOutputStream("Game.ser");
            ObjectOutputStream objSer = new ObjectOutputStream(file);
            objSer.writeObject(one);
            objSer.writeObject(two);
            objSer.writeObject(three);
            objSer.close();
        }catch (Exception e){e.printStackTrace();}
        one = null;
        two = null;
        three = null;
        //we set them to null so we can't access them from heap
        try {
            FileInputStream file = new FileInputStream("Game.ser");
            ObjectInputStream objInp = new ObjectInputStream(file);
            GameCharacter oneRestore = (GameCharacter) objInp.readObject();
            GameCharacter twoRestore = (GameCharacter) objInp.readObject();
            GameCharacter threeRestore = (GameCharacter) objInp.readObject();
            System.out.println("one's type is");
        } catch (Exception e){e.printStackTrace();}

    }
}
