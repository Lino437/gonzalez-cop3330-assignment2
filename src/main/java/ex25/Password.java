/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*Functions help you abstract away complex operations, but they also help you build reusable components.

        Create a program that determines the complexity of a given password based on these rules:

        A very weak password contains only numbers and is fewer than eight characters.
        A weak password contains only letters and is fewer than eight characters.
        A strong password contains letters and at least one number and is at least eight characters.
        A very strong password contains letters, numbers, and special characters and is at least eight characters.
        Example Output
            The password '12345' is a very weak password.
            The password 'abcdef' is a weak password.
            The password 'abc123xyz' is a strong password.
            The password '1337h@xor!' is a very strong password.
        Constraints
        Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine
        the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
        Use a single output statement.

 */

package ex25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        String password = readText();

        int strength = passwordValidator(password);

        passwordString(strength, password);
    }

    private static String readText() {
        System.out.print("Type your password: ");
        return in.nextLine();
    }

    public static boolean onlyDigits(String str)
    {
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }

    public static boolean containsSpacialChar(String password){
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        return m.find();
    }

    private static int passwordValidator(String password){
        if (password.length() < 8) {
                if (onlyDigits(password)) {
                    return 0;
                }
                if (isStringOnlyAlphabet(password)) {
                    return 1;
                }
        }

        else {
            if (!onlyDigits(password) && !isStringOnlyAlphabet(password)) {
                if (!containsSpacialChar(password)){
                    return 2;
                }
                else if (containsSpacialChar(password)){
                    return 3;
                }
            }
        }
        return 4;
    }

    private static void passwordString(int strength, String password){
        if (strength == 0){
            System.out.printf("The password \'%s\' is a very weak password.", password);
        }
        else if (strength == 1){
            System.out.printf("The password \'%s\' is a weak password.", password);
        }
        else if (strength == 2){
            System.out.printf("The password \'%s\' is a strong password.", password);
        }
        else if (strength == 3){
            System.out.printf("The password \'%s\' is a very strong password.", password);
        }
        else {
            System.out.printf("For password \'%s\' complexity can not be determined yet.", password);
        }
    }

}

