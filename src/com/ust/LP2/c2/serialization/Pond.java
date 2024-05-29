package com.ust.LP2.c2.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable {
    //pond object can be serialized
    private transient Duck duck = new Duck();
    // class Pond has one instance variable, a Duck
    public static void main(String[] args) throws IOException {
        Pond pond = new Pond();
        ObjectOutputStream objStr = null;
        try {
            FileOutputStream file = new FileOutputStream("pond.ser");
            objStr = new ObjectOutputStream(file);
            objStr.writeObject(pond);
            //when we serialize pond 0b •ect, it's duck instance variable automatically gets serialized
        } catch (Exception e) {
            e.printStackTrace();
        }
        objStr.close();
    }
}
