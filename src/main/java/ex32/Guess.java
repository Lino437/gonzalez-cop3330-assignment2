/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number between 1 and 10.
 The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number.
 Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low.
  The computer should also keep track of the number of guesses. Once the player guesses the correct number,
   the computer should present the number of guesses and ask if the player would like to play again.

Example Output
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n
Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.

 */
package ex32;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args){
        int difficulty = 0;

    }

    private static void numberGame(int difficulty){
        int max = (int) Math.pow(10, difficulty);
        while (true){

        }
    }

    private static boolean checkIfYesNo(String letters) {
        if (letters.isBlank()) {
            return false;
        }
        if (letters.isEmpty()) {
            return false;
        }
        if (letters == null) {
            return false;
        }
        if (letters.equals("y")||letters.equals("Y") || letters.equals("n") || letters.equals("N")) {
            return true;
        }
        return false;
    }


    private static double getValidInputs(String prompt) {
        double num = 0;

        while (true){
            System.out.println(prompt);
            String input = in.nextLine();

            if (checkIfDoubleNonZeroValueNonEmpty(input) == true){
                System.out.println("Please enter a valid number");
            }
            else {
                num = Double.parseDouble(input);
                break;
            }
        }

        return num;
    }

    private static boolean checkIf123(String number) {
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
            if (d <= 0 || d > 3) {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
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
            if (d <= 0) {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
