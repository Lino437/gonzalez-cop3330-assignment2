/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*Coming up with a password that meets specific requirements is something your computer can do.
 And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special characters,
 and the number of numbers. Then generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#
Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.

 */

package ex37;

import java.security.SecureRandom;
import java.util.Scanner;

public class Password{
    private static final Scanner in = new Scanner(System.in);
    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args)
    {
        int length = getValues("What's the minimum length?");
        int special = getValues("How many special characters?");
        int numbers = getValues("How many numbers?");

        String password = generateRandomPassword(length, special, numbers);
        System.out.println(password);
    }

    private static int getValues(String prompt){
        System.out.println(prompt);
        String value = in.nextLine();

        while (!checkIfDoubleNonZeroValueNonEmpty(value)) {
            System.out.println("Please enter a positive number");
            value = in.nextLine();
        }
        int number = Integer.parseInt(value);

        return number;
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
            if (d <= 0){
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String generateRandomPassword(int len, int special, int numbers)
    {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < (len - special - numbers); i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        sb.append(specialChar(numbers));
        sb.append(getRandomNumbers(numbers));

        return sb.toString();
    }

    private static char[] specialChar(int count){
        final String chars = "!@#$%^&*(),./;'[]{}:<>>?`~|_+-=";
        char[] special = new char[count];

        for (int i = 0; i < count; i++){
            special[i] = chars.charAt(random.nextInt(chars.length())) ;
        }
        return special;
    }

    private static int[] getRandomNumbers(int count){
        int[] numbers = new int[count];

        for (int i = 0; i < count - 1; i++){
            numbers[i] = random.nextInt(10);
        }

        return numbers;
    }


}
