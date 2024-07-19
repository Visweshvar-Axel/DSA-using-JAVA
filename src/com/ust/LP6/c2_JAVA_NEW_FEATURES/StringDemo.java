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

        System.out.println();
        System.out.printf("String repeat()");
        System.out.println();
        System.out.println("\uD83D\uDc08".repeat(5));

        str = " Eclair is a kind Bengal cat.\n Give her a coconut cake. Now\r\n please...";
        str.lines()
                .map(String::strip)
                .map(line -> (line.contains("please") ? "\uD83D\uDE3B".repeat(5)+line : line))
                .forEach(System.out::println);


        System.out.println("Demo: operations with whitespace in java 12");
        System.out.println();
        System.out.println(" java 12: String.indent()");
        str = "one\ntwo\nthree";
        str.lines().forEach(line -> System.out.println(line.indent(7)));

        System.out.println();
        System.out.println(" java 12: String.transform()");
        str = "Eclair is a very fluffy Persian cat.\n";
        System.out.println(str);
        System.out.println(str.transform(StringDemo::fixCatDescription));
        System.out.println();

    }

    public static String fixCatDescription(String s){
        return s.replaceAll("Eclair","jelly").replaceAll("fluffy Persian","Kind Bengal");
    }
}
