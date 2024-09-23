package Factorial;

import java.util.Scanner;

public class RecursiveFactorial {

    public static int factorial(int n){
        if(n ==0 || n==1){
            return 1; //factorial of 0 or 1 is 1
        }else {
            return  n * factorial(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Please enter a number :");
        int number = sc.nextInt();

        // Call the factorial method

        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

        sc.close();
    }
}
