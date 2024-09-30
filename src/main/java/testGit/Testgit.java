package testGit;

import java.util.Scanner;

public class Testgit {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
     
        String reversed = new StringBuilder(input).reverse().toString();
        
       
        System.out.println("Reversed string: " + reversed);
        
       
        scanner.close();
        
    
        System.out.println("project update");
    }
}