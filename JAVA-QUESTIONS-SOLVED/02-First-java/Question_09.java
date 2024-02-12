/*
 * Question 09 : Find a String is Pallindrome or not 
 * 
 */

import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Word");
        String word = in.nextLine();
        boolean flag = true ;

        word = word.toLowerCase();
        
        for(int i = 0 ; i < word.length() / 2 ; i++){
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                flag = false ;
                break ;
            }
        }

        if (flag){
            System.out.println(word + " is a Pallidrome String.");
        }else {
            System.out.println(word + " is not a Pallindrome word.");
        }
    }
}
