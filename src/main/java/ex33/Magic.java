/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
Arrays are great for storing possible responses from a program. If you combine that with a random number generator,
 you can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list and select one at random.

 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class Magic {
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        askQuestion();
        magic8Ball();
    }

    private static void askQuestion(){
        System.out.println("What's your question?");
        System.out.print("> ");
        in.nextLine();
    }

    private static void magic8Ball(){
        Random random = new Random();

        int num = random.nextInt(4);
        String[] responses = {"Yes", "No", "Maybe", "Ask again later."};

        System.out.println(responses[num]);
    }
}
