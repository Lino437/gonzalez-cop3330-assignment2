/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
Statistics is important in our field. When measuring response times or rendering times,
 it’s helpful to collect data so you can easily spot abnormalities. For example,
  the standard deviation helps you determine which values are outliers and which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

Example Output
    Enter a number: 100
    Enter a number: 200
    Enter a number: 1000
    Enter a number: 300
    Enter a number: done
    Numbers: 100, 200, 1000, 300
    The average is 400.0
    The minimum is 100
    The maximum is 1000
    The standard deviation is 353.55
Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.

 */


package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class Computing {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double[] numbers = enterANumber();
        double mean = averageOfNumbers(numbers);
        printAll(numbers, mean, minOfNumbers(numbers), maxOfNumbers(numbers), stdOfNumbers(mean, numbers));
    }

    private static void printAll(double[] arr, double average, double min, double max, double std) {
        System.out.print("Numbers: ");
        for (double v : arr) {
            System.out.print(v + ", ");
        }
        System.out.println();
        System.out.println("The average is " + average);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.printf("The standard deviation is %.2f", std);

    }

    private static double averageOfNumbers(double[] arr) {
        int length = arr.length;
        double sum = 0;

        for (double v : arr) {
            sum += v;
        }
        sum = sum / length;
        return sum;
    }

    private static double maxOfNumbers(double[] arr) {
        double max = arr[0];

        for (double v : arr) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    private static double minOfNumbers(double[] arr) {
        double min = arr[0];

        for (double v : arr) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    private static double stdOfNumbers(double mean, double[] arr) {
        double temp = 0;

        for (double val : arr) {
            double squareDiffToMean = Math.pow(val - mean, 2);

            temp += squareDiffToMean;
        }

        double meanOfDiffs = temp / arr.length;

        return Math.sqrt(meanOfDiffs);
    }


    private static double[] enterANumber() {
        ArrayList<String> numbersString = new ArrayList<>();
        String input = "";

        while (!input.equals("done")) {
            System.out.println("Enter a number: ");
            input = in.nextLine();

            if (checkIfDoubleNonZeroValueNonEmpty(input)) {
                numbersString.add(input);
            } else if (input.equals("done")) {
                break;
            } else {
                System.out.println("Please enter a number or \"done\" when finish");
            }
        }

        double[] numbers = new double[numbersString.size()];

        for (int i = 0; i < numbers.length; i++) {
            double num = Double.parseDouble(numbersString.get(i));
            numbers[i] = num;
        }

        return numbers;
    }

    private static boolean checkIfDoubleNonZeroValueNonEmpty(String number) {
        if (number.isBlank()) {
            return false;
        }
        if (number.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(number);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
