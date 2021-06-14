/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
The rule of 72 is a quick method for estimating how long it will take to double your investment, by taking the number 72 and dividing it by the expected rate of return.
 It’s a good tool that helps you figure out if the stock, bond, or savings account is right for you.
  It’s also a good program to write to test for and prevent bad input because computers can’t divide by zero.
   And instead of exiting the program when the user enters invalid input, you can just keep prompting for inputs until you get one that’s valid.

        Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.

        The formula is

        years = 72 / r
        where r is the stated rate of return.

        Example Output
            What is the rate of return? 0
            Sorry. That's not a valid input.
            What is the rate of return? ABC
            Sorry. That's not a valid input.
            What is the rate of return? 4
            It will take 18 years to double your initial investment.
        Constraints
        Don’t allow the user to enter 0.
        Don’t allow non-numeric values.
        Use a loop to trap bad input, so you can ensure that the user enters valid values.

 */

package ex29;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Handling {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double rate = getValidInputs("What is the rate of return?");
        System.out.printf("It will take %.0f years to double your initial investment.", ruleOf72(rate));
    }

    private static double getValidInputs(String prompt) {
        double num = 0;

        while (true){
            System.out.println(prompt);
            String input = in.nextLine();

            if (checkIfDoubleNonZeroValueNonEmpty(input) == false){
                System.out.println("Please enter a valid number");
            }
            else {
                num = Double.parseDouble(input);
                break;
            }
        }

        return num;
    }

    private static boolean checkIfDoubleNonZeroValueNonEmpty(String number) {
        if (number.isBlank()) {
            return false;
        }
        if (number.isEmpty()) {
            return false;
        }
        if (number == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(number);
            if (d == 0) {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private static String getInput(String prompt) {
        System.out.println(prompt);
        String input = in.nextLine();
        return input;
    }

    private static double ruleOf72(double rate) {
        double years = 72 / rate;
        years = Math.ceil(years);
        return years;
    }
}

