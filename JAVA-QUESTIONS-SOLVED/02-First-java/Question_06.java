/*
 * 6. Input currency in rupees and output in USD.
 */

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number in Rupees :");

        double indRupees = in.nextDouble();

        // Since currently 1rs == 0.012 USD
        double usd = indRupees * 0.012 ;
        System.out.println("USD :" + usd);

    }
}
