package testGit;

import java.util.Scanner;

public class Test2git {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        
        // Convert input to lowercase and remove spaces for accurate palindrome checking
        String formattedInput = input.replaceAll("\\s+", "").toLowerCase();
        
        // Reverse the string
        String reversed = new StringBuilder(formattedInput).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        if (formattedInput.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
