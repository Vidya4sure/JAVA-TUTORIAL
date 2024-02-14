/*
 * 1. Area Of Circle Java Program
 */

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle :");
        double radius = in.nextDouble();

        double Area = 3.14 * radius * radius ;

        System.out.println("Area of Circle with " + radius + " is " + Area);
    }
}
