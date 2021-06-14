/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*In previous programs, you asked the user for repeated input by writing the input statements multiple times.
 But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
    Enter a number: 1
    Enter a number: 2
    Enter a number: 3
    Enter a number: 4
    Enter a number: 5
The total is 15.
Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.

 */
package ex28;

import java.util.Scanner;

public class Adding {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        double numbers[] = new double [5];

        numbers = getDouble("Enter a number: ", 5);

        System.out.println("The total is " + sumDoubleArray(numbers));
    }

    private static double[] getDouble(String prompt, int times){
        double num[] = new double [times];
        for (int i = 0; i < times; i++){
            System.out.println(prompt);
            num[i] = in.nextDouble();
        }
        return num;
    }

    private static double sumDoubleArray(double[] numbers){
        int size = numbers.length;
        double sum = 0;
        for (int i = 0; i < size; i++){
            sum += numbers[i];
        }
        return sum;
    }
}

