package fun1;

import java.util.Scanner;

public class Userinterface {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the two numbers : ");
    	int number1 = scan.nextInt();
    	int number2 = scan.nextInt();
       scan.close();

        
        NumberCategory amicableChecker = NumberCategoryUtility.checkAmicable();
        NumberCategory palindromeChecker = NumberCategoryUtility.checkPalindrome();

        // Capture the object of NumberCategory returned by the static method
        boolean areAmicable = amicableChecker.checkNumberCategory(number1, number2);
        boolean isPalindromeProduct = palindromeChecker.checkNumberCategory(number1, number2);

      
        if (areAmicable) {
            System.out.println(number1 + " and " + number2 + " are amicable numbers");
        } else {
            System.out.println(number1 + " and " + number2 + " are not amicable numbers");
        }

        if (isPalindromeProduct) {
            System.out.println("Their Product " + (number1 * number2) + " does produce a Palindrome");
        } else {
            System.out.println("Their Product " + (number1 * number2) + " does not produce a Palindrome");
        }
    }
}
