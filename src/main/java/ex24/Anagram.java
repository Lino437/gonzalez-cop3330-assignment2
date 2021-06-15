/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

        Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.

        Example Output
            Enter two strings and I'll tell you if they are anagrams:
            Enter the first string: note
            Enter the second string: tone
            "note" and "tone" are anagrams.
        Constraints
        Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
        Check that both words are the same length.

 */


package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");
        String firstSt = readText("Enter the first string:");
        String secondSt = readText("Enter the second string:");

        Boolean tf = checkIfAnagram(firstSt,secondSt);

        if (tf){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", firstSt, secondSt);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", firstSt, secondSt);
        }
    }

    private static String readText(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public static Boolean checkIfAnagram(String first, String second) {
        int xValue = first.length();
        int yValue = second.length();

        if (xValue != yValue) {
            return false;
        }

        char[] firstLetters = new char[45];
        char[] secondLetters = new char[45];

        for (int i = 0; i < first.length(); i++) {
            firstLetters[i] = first.charAt(i);
        }

        for (int i = 0; i < second.length(); i++) {
            secondLetters[i] = second.charAt(i);
        }

        Arrays.sort(firstLetters);
        Arrays.sort(secondLetters);

        for (int i = 0; i < xValue;++i){
            if(firstLetters[i] != secondLetters[i]){
                return false;
            }
        }

        return true;
    }
}

