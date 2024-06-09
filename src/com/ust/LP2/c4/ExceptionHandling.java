package com.ust.LP2.c4;
class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

class DataProcessor {
    public double processData(int[] data) throws InvalidDataException {
        if (data == null || data.length == 0) {
            throw new InvalidDataException("array is null or empty");
        }
        int s = 0;
        for (int n : data) {
            s += n;
        }
        return (double) s / data.length;
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        DataProcessor dp = new DataProcessor();

        int[] validData = {1, 2, 3, 4, 5};
        int[] emptyData = {};
        int[] nullData = null;

        try {
            double avg = dp.processData(validData);
            System.out.println("Average: " + avg);
        } catch (InvalidDataException e) {
            System.err.println(e);
        }

        try {
            double avg = dp.processData(emptyData);
            System.out.println("Average: " + avg);
        } catch (InvalidDataException e) {
            System.err.println(e);
        }

        try {
            double avg = dp.processData(nullData);
            System.out.println("Average: " + avg);
        } catch (InvalidDataException e) {
            System.err.println(e);
        }
    }
}
