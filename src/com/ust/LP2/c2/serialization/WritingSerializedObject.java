package com.ust.LP2.c2.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingSerializedObject {
    public static void main(String[] args) throws IOException {
        // 1 ) Make a FileOutputStream
        FileOutputStream file = new FileOutputStream("GameCharacter.ser");

        // 2 make an ObjectOutputStream
        ObjectOutputStream objstr = new ObjectOutputStream(file);

        // ObjectOutputStream lets us write objects but it cant t directly
        // connect to file
        // so, we have to do stream chaining
        // 3 write the object


        objstr.writeObject(characterOne);
        objstr.writeObject(characterTwo);
        objstr.writeObject(characterThree);

        //4 close the ObjectOutputStream
        objstr.close();
    }
    // the good oop design says:
    //each class does one thing well!! I

    /**
     * next
     * */
    // Object:-->>
    // when we perform os.write:
    // object is wrSteen to:
    // object is flattened(serialized)
    // ObjectOutputStream
    // so after flattened, is chained to FileOutputStream:
    // so it converts objects into bytes.
    /**
     * next
     * */
    /**
     * next
     * */
    /* *
    * 1) object on the heap:
    * object has state: represented by value of instance variables
    * these values make one instance of a class different from another instances of the same class
    *
    * Class foo{
    * int height;
    * int weignt
    * }
    * foo f = new foo();
    * f.setHeight(50);
    * f.setWeight(50);
    *
    * 2) objects serialized:
    * serialized objects save the values of the instance variables, so that an identical instance can be brought back to life on the heap:
    * FileOutputStream file = new FileOutputStream("foo.ser");
    * ObjectOutputStream objstr = new ObjectOutputStream(file);
    * objstr.writeObject(f);
    *
    * the instance variable values for width and height are saved to the file "f. ser"
    * along with a little more information the JVM needs to restore the object(like what's its class type)
    * */
    /**
     * next
     * */
    /* *
    * class car{
    * engine e;
    * tire t;
    * }
    * class engine{
    * }
    * class tire{
    * }
    * when an object is serialized, ail the objects it refers from instance variables are also serilaized.
    * and ail the objects those objects refers are also serialized.
    * and all the objects those objects refer are also serialized,
    * and the best part is it happens automatically
    * */
    /**
     * next
     * */
    /* *
    * The serializable interface is known as a marker or a tag interface,
    * because the interface doesn't have any methods to implement
    * its sole purpose is to announce that the class implementing it is, serializable.
    *
    * in other words, objects of that type are savable through the serialization mechanism
    * if any superclass is seriaizabie,the subicass is automatically serializable even if the subclass doesn't explicitly declare implements Serializable
    *
    * objectOutputStream. writeObject (anObject) ;
    * anObject must implement serializable or it, would fail at runtime
    * */
}
