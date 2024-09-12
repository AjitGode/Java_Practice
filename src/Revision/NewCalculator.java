package Revision;

import java.util.Scanner;

public class NewCalculator {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Display menu options to the user
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication");
        System.out.println("4. Division ");

        //user to enter their choice:
        System.out.println("Enter your choice: 1/2/3/4");
        int choice = sc.nextInt();

        // User Enter the Second Number:
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        // User Enter the Second Number:
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int result; // variable to store the result

        // Perform the chosen operation using a switch statement
        switch (choice) {
            case 1:
                // Addition :
                result = num1 + num2;
                System.out.println(" Addition :" + result);
                break;

            case 2:
                //Substraction :
                result = num1 - num2;
                System.out.println(" Substraction : " + result);
                break;

            case 3:
                //Multiplication:
                result = num1 * num2;
                System.out.println(" Multiplication : " + result);
                break;

            case 4:
                // Division :
                result = num1 / num2;
                System.out.println(" Division : " + result);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        // Close the Scanner object
        sc.close();
    }

}
