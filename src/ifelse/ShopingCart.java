package ifelse;

import java.util.Scanner;

public class ShopingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Display available products
        System.out.println("Available Products:");
        System.out.println("1. Laptop (Price: 40000 Rs)");
        System.out.println("2. Smartphone (Price: 25000 Rs)");
        System.out.println("3. Headphones (Price: 3000 Rs)");
        System.out.println("4. Smartwatch (Price: 5000 Rs)");
        System.out.println("5. Tablet (Price: 15000 Rs)");

        // Prices of products
        double priceLaptop = 40000;
        double priceSmartphone = 25000;
        double priceHeadphones = 3000;
        double priceSmartwatch = 5000;
        double priceTablet = 15000;

        // User choices and quantities
        System.out.print("Do you want to buy a Laptop? (yes/no): ");
        String choice1 = sc.next();
        int qtyLaptop = 0;
        if (choice1.toLowerCase().equals("yes")) {
            System.out.print("Enter quantity for Laptop: ");
            qtyLaptop = sc.nextInt();
        }

        System.out.print("Do you want to buy a Smartphone? (yes/no): ");
        String choice2 = sc.next();
        int qtySmartphone = 0;
        if (choice2.toLowerCase().equals("yes")) {
            System.out.print("Enter quantity for Smartphone: ");
            qtySmartphone = sc.nextInt();
        }

        System.out.print("Do you want to buy Headphones? (yes/no): ");
        String choice3 = sc.next();
        int qtyHeadphones = 0;
        if (choice3.toLowerCase().equals("yes")) {
            System.out.print("Enter quantity for Headphones: ");
            qtyHeadphones = sc.nextInt();
        }

        System.out.print("Do you want to buy a Smartwatch? (yes/no): ");
        String choice4 = sc.next();
        int qtySmartwatch = 0;
        if (choice4.toLowerCase().equals("yes")) {
            System.out.print("Enter quantity for Smartwatch: ");
            qtySmartwatch = sc.nextInt();
        }

        System.out.print("Do you want to buy a Tablet? (yes/no): ");
        String choice5 = sc.next();
        int qtyTablet = 0;
        if (choice5.toLowerCase().equals("yes")) {
            System.out.print("Enter quantity for Tablet: ");
            qtyTablet = sc.nextInt();
        }

        // Calculate total amount
        double totalAmount = (qtyLaptop * priceLaptop) + (qtySmartphone * priceSmartphone) +
                (qtyHeadphones * priceHeadphones) + (qtySmartwatch * priceSmartwatch) +
                (qtyTablet * priceTablet);

        // Determine eligibility for discount
        double discount = 0;
        if (totalAmount >= 10000) {
            discount = totalAmount * 0.10; // 10% discount
            System.out.println("\nCongratulations! You got a 10% discount on your purchase.");
            System.out.println("You saved " + discount + " Rs.");
        } else {
            double remainingAmount = 10000 - totalAmount;
            System.out.println("\nYou are not eligible for the discount.");
            System.out.println("Purchase more items worth " + remainingAmount + " Rs to avail the offer.");
        }

        // Display total amount after applying discount
        double finalAmount = totalAmount - discount;
        System.out.println("Total amount to pay after discount (if applicable): " + finalAmount + " Rs.");

        sc.close();

    }
}
