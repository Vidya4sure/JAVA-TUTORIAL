import java.util.Scanner;

/**
 * Question_03
 * 3. Write a program to input principal, time, and rate (P, T, R) from the user and
    find Simple Interest.
 */
public class Question_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle Amount : ");
        double principle = in.nextDouble();

        System.out.print("Enter the Interest Rate : ");
        int interest = in.nextInt();

        System.out.print("Enter the Time in Years: ");
        int time = in.nextInt();

        double SI = (principle * interest * time) / 100 ;
        System.out.println("Simple Interest : " + SI);
        
        double totalAmount = principle + SI ;
        System.out.print("Total Amount : " + totalAmount);
    }
    
}
