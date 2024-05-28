package com.ust.LP2.c2.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingSerializedObject {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream("GameCharacter.ser");

        ObjectOutputStream objstr = new ObjectOutputStream(file);

        objstr.writeObject(characterOne);
        objstr.writeObject(characterTwo);
        objstr.writeObject(characterThree);

        objstr.close();
    }
}
