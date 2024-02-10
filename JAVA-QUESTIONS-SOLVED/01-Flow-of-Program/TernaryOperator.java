import java.util.Scanner;

public class TernaryOperator {
    // First let start with if else condition for finding the odd and even number 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a ;
        
        System.out.println("Enter the first numeber");
        a = in.nextInt();

        if (a % 2 == 0){
            System.out.println(a + "is a even number");
        }else{
            System.out.println(a + " is a odd number");
        }

        // Now here I am using Ternary operator 
        // int variable = "Condition" ? "if condition is TRUE" : "if codition is FALSE";

        System.out.println("Enter the second number");
        int b = in.nextInt();

        String result = (b % 2 == 0) ? "Even" : "Odd" ; 

        System.out.println(result);
    }
 

}
