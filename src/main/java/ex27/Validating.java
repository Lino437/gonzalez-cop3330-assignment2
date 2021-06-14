/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
    Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each.
     The program can then call these functions in sequence to perform the work.

    Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

    The first name must be filled in.
    The last name must be filled in.
    The first and last names must be at least two characters long.
    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
    The ZIP code must be a number.
    Display appropriate error messages on incorrect data.

    Example Output
            Enter the first name: J
            Enter the last name:
            Enter the ZIP code: ABCDE
            Enter the employee ID: A12-1234
            The first name must be at least 2 characters long.
            The last name must be at least 2 characters long.
            The last name must be filled in.
            The employee ID must be in the format of AA-1234.
            The zipcode must be a 5 digit number.
            Or

            Enter the first name: John
            Enter the last name: Johnson
            Enter the ZIP code: 55555
            Enter the employee ID: TK-4321
            There were no errors found.
    Constraints
    Create a function for each type of validation you need to write.
     Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
    Use a single output statement to display the outputs.


 */

package ex27;

import java.util.Scanner;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validating {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        String first = readText("Enter the first name: ");
        String last = readText("Enter the last name: ");
        String zipCode = readText("Enter the ZIP code: ");
        String employeeId = readText("Enter the employee ID: ");

        int validFirst = validateFirst(first);
        int validLast = validateLast(last);
        boolean validZip = validateZip(zipCode);
        boolean validId = validateId(employeeId);

        validateInput(first, validFirst, last, validLast, zipCode, validZip, employeeId, validId);
    }

    private static void validateInput(String first, int validFirst, String last, int validLast, String zipCode, boolean validZip, String employeeId, boolean validId) {
        // first name
        if (validFirst == 0){
            System.out.println("The first name must be filled in.");
        }
        else if (validFirst == 1) {
            System.out.println("Enter the first name: " + first);
        }
        else {
            System.out.println("The first name must be at least 2 characters long.");
        }
        // last name
        if (validLast == 0){
            System.out.println("The last name must be filled in.");
        }
        else if (validLast == 1) {
            System.out.println("Enter the first name: " + last);
        }
        else {
            System.out.println("The last name must be at least 2 characters long.");
        }
        // zip code
        if (validZip){
            System.out.println("Enter the ZIP code: " + zipCode);
        }
        else{
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        // employee ID
        if (validId){
            System.out.println("Enter the ZIP code: " + employeeId);
        }
        else{
            System.out.println("The zipcode must be a 5 digit number.");
        }
        if(validFirst == 1 && validLast == 1 && validZip == true && validId == true){
            System.out.println("There were no errors found.");
        }
    }

    private static String readText(String prompt) {
        System.out.print(prompt);
        String text = in.nextLine();
        return text;
    }

    private static int validateFirst(String text) {
        if (text.length() < 3){
            if (text.length() == 0){
                return 0;
            }
            return 2;
        }
        return 1;
    }

    private static int validateLast(String text) {
        if (text.length() < 3){
            if (text.length() == 0){
                return 0;
            }
            return 2;
        }
        return 1;
    }

    public static boolean validateZip(String text)
    {
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
        if (text == null) {
            return false;
        }
        if (String.valueOf(text).length() != 5) {
            return false;
        }
        Matcher m = p.matcher(text);
        return m.matches();
    }
 //   Enter the employee ID: TK-4321

    private static boolean validateId(String text) {
        char[] ch = new char[8];
        for (int i = 0; i < text.length(); i++){
            ch[i] = text.charAt(i);
        }
        if (text.length() != 7){
            return false;
        }
        else if (Character.isLowerCase(ch[0])){
            return false;
        }
        else if (Character.isLowerCase(ch[1])){
            return false;
        }
        for (int i = 3; i < 7; i++){
            Boolean flag = Character.isDigit(text.charAt(i));
            if (flag){

            }
            else{
                return false;
            }
        }

        return true;
    }



}
