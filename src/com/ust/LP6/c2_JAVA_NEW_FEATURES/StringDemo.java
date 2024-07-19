package com.ust.LP6.c2_JAVA_NEW_FEATURES;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("Demo: operations with whitespace in java 11");

        String str = "     viswa        \u2003";
        System.out.printf("Str: '%s'\n",str);
        System.out.printf("Str.trim: '%s'\n",str.trim()); //only return trined less than u 0020
        System.out.printf("Str: '%s'\n",str.strip());
        System.out.printf("Str: '%s'\n",str.stripLeading());
        System.out.printf("Str: '%s'\n",str.stripTrailing());

        String demo = "";
        System.out.printf("'%s'.isBlank(): %b\n",demo,demo.isBlank());

        demo = "not blank";
        System.out.printf("'%s'.isBlank(): %b\n",demo,demo.isBlank());

        demo = "          ";
        System.out.printf("'%s'.isBlank(): %b\n",demo,demo.isBlank());

        demo = "\t    \t\u2003";
        System.out.printf("'%s'.isBlank(): %b\n",demo,demo.isBlank());

    }
}
