package com.ust.LP4.a1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StringMatch {
    public static String readFiles(String fileName){
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
