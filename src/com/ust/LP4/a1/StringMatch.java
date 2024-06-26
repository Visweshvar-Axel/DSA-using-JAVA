package com.ust.LP4.a1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StringMatch {
    public static String readFiles(String fileName){
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println(new String(String.valueOf(Paths.get(fileName))));
            throw new RuntimeException(e);
        }
    }

    public static boolean naiveSearch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();

        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;
            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == patternLength) {
                return true;
            }
        }
        return false;
    }

    private static final int ALPHABET_SIZE = 256;

    public static int[] preprocessPattern(String pattern) {
        int[] badCharShift = new int[ALPHABET_SIZE];
        int patternLength = pattern.length();

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            badCharShift[i] = -1;
        }

        for (int i = 0; i < patternLength; i++) {
            badCharShift[pattern.charAt(i)] = i;
        }

        return badCharShift;
    }

    public static boolean boyerMooreSearch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        int[] badCharShift = preprocessPattern(pattern);

        int shift = 0;
        while (shift <= (textLength - patternLength)) {
            int j = patternLength - 1;

            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }

            if (j < 0) {
                return true;
            } else {
                shift += Math.max(1, j - badCharShift[text.charAt(shift + j)]);
            }
        }
        return false;
    }

    public static int[] computeLPSArray(String pattern) {
        int length = 0;
        int i = 1;
        int patternLength = pattern.length();
        int[] lps = new int[patternLength];
        lps[0] = 0;

        while (i < patternLength) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static boolean KMPSearch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        int[] lps = computeLPSArray(pattern);
        int i = 0;
        int j = 0;

        while (i < textLength) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == patternLength) {
                return true;
            } else if (i < textLength && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String innocentText = readFiles("src/com/ust/LP4/a1/innocent_text.txt");
        String hiddenMessage = readFiles("src/com/ust/LP4/a1/message_to_find.txt");

        if (naiveSearch(innocentText, hiddenMessage)) {
            System.out.println("Naive Search: The hidden message \'"+hiddenMessage+"\' was found!");
        } else {
            System.out.println("Naive Search: The hidden message \'"+hiddenMessage+"\' was not found.");
        }

        if (boyerMooreSearch(innocentText, hiddenMessage)) {
            System.out.println("Boyer-Moore Search: The hidden message \'"+hiddenMessage+"\' was found!");
        } else {
            System.out.println("Boyer-Moore Search: The hidden message \'"+hiddenMessage+"\' was not found.");
        }

        if (KMPSearch(innocentText, hiddenMessage)) {
            System.out.println("KMP Search: The hidden message \'"+hiddenMessage+"\' was found!");
        } else {
            System.out.println("KMP Search: The hidden message \'"+hiddenMessage+"\' was not found.");
        }
    }
    /* *
    * Naive Search: The hidden message 'visweshvar' was found!
    * Boyer-Moore Search: The hidden message 'visweshvar' was found!
    * KMP Search: The hidden message 'visweshvar' was found!
    * */
}
