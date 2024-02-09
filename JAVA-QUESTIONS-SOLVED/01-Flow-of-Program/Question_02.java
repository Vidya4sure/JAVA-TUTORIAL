/*
    2. Take two numbers and print the sum of both.
*/

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a First Number : ");
        int a = in.nextInt();
        System.out.println("Enter a Second Number : ");
        int b = in.nextInt();

        int sum = a + b ;
        System.out.println("Total Sum : " + sum);
    }
    
}
