package Switch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Display the options
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Take the input for the operations
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = sc.nextInt();

        System.out.println("Please enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Please enter the second number:");
        int num2 = sc.nextInt();

        int result;
        switch (choice) {

            case 1:
                result = num1 + num2;
                System.out.println("Result :" +num1 + " + " + num2 + " = " + result);
                break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result :" +num1 + " - " + num2 + " = " + result);
                    break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Result :" +num1 + " * " + num2 + " = " + result);
                        break;

                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice. Please choose a valid operation (1-4).");
        }
        // Close the scanner
        sc.close();
    }
}
