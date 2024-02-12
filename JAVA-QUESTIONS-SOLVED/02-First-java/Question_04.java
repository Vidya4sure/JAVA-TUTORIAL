import java.util.Scanner;

/*
 * 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
 */

public class Question_04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number : ");
        double a = in.nextDouble();

        System.out.print("Enter Second number : ");
        double b = in.nextDouble();
        
        double sum = a + b ;
        double sub = a - b ;
        double multiply = a * b ;
        double divide = a/b ;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multiply);
        System.out.println(divide);
    }
    
}