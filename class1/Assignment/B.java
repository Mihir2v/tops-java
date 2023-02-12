package class1.Assignment;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        String input = scan.next();
        
        if (input.length() != 1) {
            System.out.println("Error: input must be a single letter.");
            return;
        }
        
        char letter = input.charAt(0);
        if (!Character.isLetter(letter)) {
            System.out.println("Error: input must be a letter.");
            return;
        }
        
        System.out.println("Valid input: " + letter);
    }
}

