/*
 * 7. To calculate Fibonacci Series up to n numbers.
 */

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter fibonacci series : ");
        int step = in.nextInt();

        int firstNum = 0;
        int secondNum = 1 ;
        
        int nextNum;
        for(int i = 0 ; i <= step ; i++){
            System.out.print(firstNum + " , ");
            nextNum = firstNum + secondNum ;
            firstNum = secondNum ;
            secondNum = nextNum ;
        }
    }
}
