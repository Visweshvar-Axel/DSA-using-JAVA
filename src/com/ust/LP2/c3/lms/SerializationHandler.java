package com.ust.LP2.c3.lms;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationHandler implements SerializationService {
    public void serializeLibrary (Library library, String fileName) {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream obj = new ObjectOutputStream(fout);
            obj.writeObject(library);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
