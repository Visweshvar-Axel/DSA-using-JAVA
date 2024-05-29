package com.ust.LP2.c2.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable {
    //pond object can be serialized
    private Duck duck = new Duck();

    public static void main(String[] args) throws IOException {
        Pond pond = new Pond();
        ObjectOutputStream objStr = null;
        try {
            FileOutputStream file = new FileOutputStream("ser/pond.ser");
            objStr = new ObjectOutputStream(file);
            objStr.writeObject(pond);
        } catch (Exception e) {
            e.printStackTrace();
        }
        objStr.close();
    }
}
