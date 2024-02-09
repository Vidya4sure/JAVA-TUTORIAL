import java.util.Scanner;

/**
 * Question_01
  
 1. Input a year and find whether it is a leap year or not.

 */
public class Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Year : ");
        int year = in.nextInt();
        if (year%4 == 0) {
            System.out.println(year +  " a leap Year");
        }else {
            System.out.println(year +  " is not a leap year");
        }
    }
}