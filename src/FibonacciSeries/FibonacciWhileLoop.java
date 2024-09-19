package FibonacciSeries;

import java.util.Scanner;

public class FibonacciWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        // Initialize the first two terms of the Fibonacci series

        int t1=0;
        int t2=1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        int count=1;
        while (count<=n) {
            // Print the current term
            System.out.println(t1+" ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            count++;

        }
        sc.close();
    }
}
