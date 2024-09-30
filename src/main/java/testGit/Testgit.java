package testGit;

import java.util.Scanner;

public class Testgit {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}