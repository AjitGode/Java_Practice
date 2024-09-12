package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the user word:
        System.out.println("Enter a string: ");

        String input = sc.nextLine();

        // Call the method to check if the input is a palindrome
        if(isPalindrome(input)){
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close();

    }
    // Method to check if the string is a palindrome
    public static boolean isPalindrome (String str){
        int n = str.length();

        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false; // Not a palindrome
            }
        }
       return true; // It's Palindrom
    }
}