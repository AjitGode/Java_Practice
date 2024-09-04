package Revision;

import java.util.Scanner;

public class revision1 {
    public static void main(String[] args) {
        int numA = 15;
        int numB = 30;
        double decimalValue = 7.5;
        boolean flag = false;
        String firstName = "John";
        String lastName = "Doe";

        Scanner scanner = new Scanner(System.in);

        int addition  = numA + numB;
        int subtraction = numA - numB;
        int multiplication = numA * numB;
        double division = (double) numA / numB;
        int modulus = numA % numB;
        System.out.println("Addition of A&B Is: " + addition);
        System.out.println("Subtraction of A&B Is: " + subtraction);
        System.out.println("Multiplication of A&B Is: " + multiplication);
        System.out.println("Division of A&B Is: " + division);
        System.out.println("Modular of A&B Is: " + modulus);

        boolean isEqual = (numA == numB);
        boolean isGreater = (numA > numB);

        if (isEqual) {
            System.out.println("a=b");
        } else if (isGreater) {
            System.out.println("a>b");
        } else {
            System.out.println("a<b");
        }

        System.out.println("--a " + (--numA));
        System.out.println("++a " + (++numA));
        System.out.println("a-- " + (numA--));

        String welcomeMessage = firstName + " " + lastName;
        System.out.println("Welcome " + welcomeMessage);

        if (welcomeMessage.equals("John Doe")) {
            System.out.println("Hello");
        }

        int bitwiseAnd = numA & numB;
        int bitwiseOr = numA | numB;
        int bitwiseXor = numA ^ numB;

        System.out.println("Bitwise And: " + bitwiseAnd);
        System.out.println("Bitwise Or: " + bitwiseOr);
        System.out.println("Bitwise Xor: " + bitwiseXor);

        if (isEqual && (numA > numB)) {
            System.out.println("Short-circuit");
        }
        if (isEqual || (numA < numB)) {
            System.out.println("Short-circuit");
        }

        if (numA > 0 && numB > 0 && numA > numB) {
            System.out.println("Chained");
        }

        numA += 5; // numA = numA + 5
        System.out.println("A after addition: " + numA);

        System.out.println("Enter Two Numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        switch (number1) {
            case 1:
                int add = number1 + number2;
                System.out.println("Addition of two numbers:  " + add);
                break;

            case 2:
                int sub = number1 - number2;
                System.out.println("Subtraction of Two Numbers: " + sub);
                break;

            case 3:
                int mul = number1 * number2;
                System.out.println("Multiplication of Two Numbers: " + mul);
                break;

            case 4:
                int div = number1 / number2;
                System.out.println("Division of Two Numbers: " + div);
                break;

            case 5:
                int mod = number1 % number2;
                System.out.println("Modular Of Two Numbers: " + mod);
                break;

            default:
                System.out.println("No Valid Case");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome");
        }
        System.out.println("Total Execution is 5 Times");

        int[] array = {1, 2, 3};

        for (int row : array) {
            for (int element : array) {
                System.out.println(element);
            }

            while (true) {
                System.out.println("Hello Welcome");
                System.out.println("Welcome");
                break;
            }

            int a1 = 2;

            do {
                System.out.println(a1);
                a1++;
            } while (a1 <= 5);
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}