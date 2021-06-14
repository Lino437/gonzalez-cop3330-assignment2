
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */
package ex26;

public class PaymentCalculator {


    //   n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

    public static int calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayments){
        int numberOfMonths;
        double numerator;
        double denominator;

        apr = apr / 100;
        apr = apr / 365;

        numerator =  Math.log10(1 + (balance / monthlyPayments) * (1 - Math.pow((1 + (apr)), 30)));
        denominator = -30 * Math.log10(1 + apr);

        numberOfMonths = (int) (Math.ceil(numerator / denominator));

        return numberOfMonths;
    }
}
