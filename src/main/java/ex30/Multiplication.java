/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Gonzalez
 */

/*
Exercise 30 - Multiplication Table
Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).

Example Output

    1    2    3    4    5    6    7    8    9   10   11   12
    2    4    6    8   10   12   14   16   18   20   22   24
    3    6    9   12   15   18   21   24   27   30   33   36
    4    8   12   16   20   24   28   32   36   40   44   48
    5   10   15   20   25   30   35   40   45   50   55   60
    6   12   18   24   30   36   42   48   54   60   66   72
    7   14   21   28   35   42   49   56   63   70   77   84
    8   16   24   32   40   48   56   64   72   80   88   96
    9   18   27   36   45   54   63   72   81   90   99  108
   10   20   30   40   50   60   70   80   90  100  110  120
   11   22   33   44   55   66   77   88   99  110  121  132
   12   24   36   48   60   72   84   96  108  120  132  144
Constraint
Use a nested loop to complete this program.
Align each column within the table without using the tab character.

 */
package ex30;


public class Multiplication {


    public static void main(String[] args) {
        // Number less that 32
        int baseNumber = 12;
        baseNumber += 1;

        int[] factors1 = new int[baseNumber];
        int[] factors2 = new int[baseNumber];

        initDoubleArray(factors1, baseNumber);
        initDoubleArray(factors2, baseNumber);

        multiplicationTable(factors1, factors2);
    }

    private static void initDoubleArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
    }

    private static void multiplicationTable(int[] factors1, int[] factors2) {
        Character ch = ' ';
        int max = Math.max(factors1.length, factors2.length);
        for (int i = 1; i < max; i++) {
            for (int j = 1; j < max; j++) {
                String st = String.valueOf(factors1[i] * factors2[j]);
                st = st + "  ";
                if (st.charAt(1) == ch){
                    st = "  " + st;
                    System.out.printf("  %.3s", st);
                }
                else if (st.charAt(2) == ch) {
                    st = " " + st;
                    System.out.printf("  %.3s", st);
                }
                else{
                    System.out.printf("  %.3s", st);
                }
            }
            System.out.println();
        }
    }

}
