package SumOfDigits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        // scanner for the user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        for(int n=num; n!=0; n=n/10 ){

            int digit = n % 10;  // Get the last digit
            sum = sum + digit;   // Add the last digit to sum

        }

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
