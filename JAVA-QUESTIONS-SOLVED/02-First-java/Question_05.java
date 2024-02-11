/*
    5. Take 2 numbers as input and print the largest number.
*/

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int numOne = in.nextInt();

        System.out.print("Enter Second number : ");
        int numTwo = in.nextInt();

        if (numOne > numTwo){
            System.out.println(numOne + " is a largest number.");
        }else {
            System.out.println(numTwo + " is a largest number.");
        }
        
    }
}
