package com.ust.LP3.c1;

import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // resource should be extended AutoClosable
            int[] arr = {1, 2, 3};
            int num = arr[3];
        } // catch or finally is not mandatory
    }
}
