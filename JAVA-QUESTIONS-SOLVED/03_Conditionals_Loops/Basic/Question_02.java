/*
 * 2. Area Of Triangle
 */

import java.util.Scanner;

/**
  * Question_02
  */
 public class Question_02 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Base of the Triangle :");
        double base = in.nextDouble();

        System.out.println("Enter the height of the Triangle :");
        double height = in.nextDouble();

        double Area = 0.5 * base * height ;
        System.out.print("Area : " + Area);
    }
 }