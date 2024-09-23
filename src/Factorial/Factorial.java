package Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");

        int num = sc.nextInt();

        // Calculate the factorial
        long fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        // Display the result
        System.out.println("Factorial of " +num+ " is :" +fact);

        sc.close();

    }
}
