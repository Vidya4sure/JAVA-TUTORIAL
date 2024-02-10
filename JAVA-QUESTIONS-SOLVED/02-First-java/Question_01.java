/*
1. Write a program to print whether a number is even or odd, also take
    input from the user.
*/

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num = in.nextInt();

        // Here I am using Ternary Operator !!
        String result = num % 2 == 0 ? num + " is a Even Number" : num + " is a Odd Number" ;
        System.out.println(result);
        
    }
    
}