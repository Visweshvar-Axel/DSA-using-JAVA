package com.ust.LP6.c2_JAVA_NEW_FEATURES;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\VISWA\\IdeaProjects\\JAVA_UST\\src\\com\\ust\\LP6\\c2_JAVA_NEW_FEATURES\\FilesDemolnput.txt");
        //old way: java 8
        Files.lines(path).forEach(line -> System.out.println(line));

        //java 11
        System.out.println(Files.readString(path));

        Files.writeString(path, "viswa\naxel");
        System.out.println(Files.readString(path));

        // java 12
        Path path1 = Path.of("C:\\Users\\VISWA\\IdeaProjects\\JAVA_UST\\src\\com\\ust\\LP6\\c2_JAVA_NEW_FEATURES\\FilesDemolnput1.txt");

        System.out.println(Files.isSameFile(path,path));
        System.out.println(Files.mismatch(path,path));

    }
}
