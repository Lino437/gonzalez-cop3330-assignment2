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

    public static void main(String[] args) {
        boolean tf = true;
        System.out.println("Let's play Guess the Number!");
        System.out.println();
        while(tf){
            numberGame();
            tf = continueOrStop();
        }
    }

    private static void numberGame() {
        Random random = new Random();

        int count = 0;
        int difficulty = getValidInputs("Enter the difficulty level (1, 2, or 3):");
        int max = (int) Math.pow(10, difficulty);
        int x = random.nextInt(max) + 1;
        int num;

        num = getValidInputs("I have my number. What's your guess?");

        while(true){
            count += 1;

            if (num  < x) {
                num = getValidInputs("Too low. Guess again:");
            }
            else if (num > x){
                num = getValidInputs("Too high. Guess again:");
            }
            else{
                System.out.printf("You got it in %d guesses!\n", count);
                System.out.println();
                break;
            }
        }
    }

    private static boolean continueOrStop(){
        System.out.println("Do you wish to play again?  (Y/N)");
        String yesNo = in.nextLine();
        return yesNo.equals("y") || yesNo.equals("Y");
    }

    private static int getValidInputs(String prompt) {
        int num;

            System.out.println(prompt);
            String input = in.nextLine();

            if (!checkIfDoubleNonZeroValueNonEmpty(input)) {
                return 0;
            } else {
                num = Integer.parseInt(input);
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
        try {
            double d = Integer.parseInt(number);
            if (d <= 0) {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
