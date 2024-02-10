// 4. Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class Question_04 {
    public static int findLcm(int a , int b){
        int max = Math.max(a, b);

        while (true) {
            if (max % a == 0 && max % b== 0) {
                return max;
            }
            ++max;
        }
    }
    
    public static int findHcf(int a , int b){


        // int newResult = 1 ;
        // for (int i = 1 ; i <= a && i <= b ; i++){
        //     if (a % i == 0 && b % i == 0){
        //         newResult = i ;
        //     }
        // }

        // return newResult ;

        // OPTIMISED APPROACHED 

        while(a != b){
            if (a > b) 
                a = a - b ;
            if (b > a)
                b = b - a ;
        }

        return a ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int numOne = in.nextInt();
        System.out.println("Enter Second Number :");
        int numTwo = in.nextInt();

        int lcm = findLcm(numOne, numTwo);
        System.out.println("LCM :" + lcm);

        int hcf = findHcf(numOne , numTwo);
        System.out.println("HCF :" + hcf);
    }
}
