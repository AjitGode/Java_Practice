package Interface;

import java.util.Scanner;

interface  calculatorApp{
    // Method
    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);
}
// Implementation of Calculator Interface
class  SimpleCalculator implements calculatorApp{

    // Addition
    public  int add(int num1, int num2){
        return  num1 + num2;
    }
    // Substraction :

    public int sub(int num1, int num2){
        return num1-num2;
    }

    // Multiplication :

    public int mul(int num1, int num2){
        return num1 * num2;
    }

    // Division :

    public  int div(int num1, int num2){
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return  num1/num2;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a SimpleCalculator object

        calculatorApp calculator = new SimpleCalculator();

        System.out.println("Select an operation: add, subtract, multiply, divide");
        String operation = sc.nextLine();

        // Input for numbers
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        int result = 0;

        switch (operation.toLowerCase()) {
            case "add":
                result = calculator.add(num1, num2);
                break;
            case "subtract":
                result = calculator.sub(num1, num2);
                break;
            case "multiply":
                result = calculator.mul(num1, num2);
                break;
            case "divide":
                try {
                    result = calculator.div(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);

    }
}
