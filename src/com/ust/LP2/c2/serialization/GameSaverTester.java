package com.ust.LP2.c2.serialization;

import java.io.FileOutputStream;
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

    }
}
