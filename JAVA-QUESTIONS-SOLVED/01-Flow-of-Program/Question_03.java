/*
 * 3. Take a number as input and print the multiplication table for it.
 */

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();

        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
