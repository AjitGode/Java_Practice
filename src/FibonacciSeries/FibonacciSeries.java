package FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initialize the first two terms of the Fibonacci series
        int t1 = 0;
        int t2 = 1;

        // Print the header for the Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Calculate and print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            // Print the current term
            System.out.print(t1 + " ");

            // Calculate the next term
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        // Close the Scanner object
        scanner.close();
    }
}
