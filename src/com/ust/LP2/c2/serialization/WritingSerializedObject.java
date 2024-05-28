package com.ust.LP2.c2.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingSerializedObject {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 1 ) Make a FileOutputStream
        FileOutputStream file = new FileOutputStream("GameCharacter.ser");

        // 2 make an ObjectOutputStream
        ObjectOutputStream objstr = new ObjectOutputStream(file);

        // ObjectOutputStream lets us write objects but it cant t directly
        // connect to file
        // so we have to do stream chaining
        // 3 write the object
        objstr.writeObject(characterOne);
        objstr.writeObject(characterTwo);
        objstr.writeObject(characterThree);

        //4 close the ObjectOutputStream
        objstr.close();
    }
    // the good oop design says:
    //each class does one thing well!! I

    // Object:-->>
    // when we perform os.write:
    // object is wrSteen to:
    // object is flattened(serialized)
    // ObjectOutputStream
    // so after flattened, is chained to FileOutputStream:
    // so it converts objects into bytes.
}
