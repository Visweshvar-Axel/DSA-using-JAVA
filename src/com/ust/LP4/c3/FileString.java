package com.ust.LP4.c3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileString {
    public static void main(String []args) {
        FileReader f = null;
        try {
            f = new FileReader(new File("team.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(f);
        String file = "";
        while(sc.hasNextLine()) file += sc.nextLine();
        System.out.println(file);
        if (file.contains("viswa")) {
            System.out.println("viswa found at index: "+file.indexOf("viswa"));
        } else System.out.println("Not Found");
    }
}
