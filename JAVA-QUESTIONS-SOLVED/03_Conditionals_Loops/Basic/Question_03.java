/*
 * 3. Area Of Rectangle Program 
 */

import java.util.Scanner;

/**
 * Question_03
 */
public class Question_03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Lenght of the Rectangle : ");
        double length = in.nextDouble();

        System.out.println("Enter the Breath of the Rectangle : ");
        double breath = in.nextDouble();

        double Area = length * breath ;
        System.out.println("Area of Rectangle : " + Area);
    }
}