/*
 * 8. To find out whether the given number is Palindrome or not.
 */

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();
        int reverse = 0;

        // while (num != 0) {
        //     int rem = num % 10 ;
        //     reverse = reverse * 10 + rem ;
        //     count ++ ;
        //     num = num / 10 ;
        // }

        for(int i = num ; i > 0 ; i = i/10)
            reverse = reverse * 10 + i % 10 ;
        
        if (num == reverse) {
            System.out.println( num + " Number is a Pallindrom");
        }else {
            System.out.println( num + " Number is not Pallindrome");
        }
    }
}
