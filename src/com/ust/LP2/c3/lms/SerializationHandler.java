package com.ust.LP2.c3.lms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationHandler implements SerializationService {
    public void serializeLibrary (Library library, String fileName) {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream obj = new ObjectOutputStream(fout);
            obj.writeObject(library);
        } catch (Exception e) { e.printStackTrace(); }
    }
    public Library deserializeLibrary (String fileName) {
        Library lobj = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream osi = new ObjectInputStream(fis);
            lobj = (Library) osi.readObject();
        } catch (Exception e) { e.printStackTrace(); }
        return lobj;
    }
}
