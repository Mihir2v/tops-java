package class1.Assignment;
import java.util.Scanner;

public class D {
	


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        int sum = 0;
	        int number;
	        
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Enter a number: ");
	            number = scan.nextInt();
	            sum += number;
	        }
	        
	        double average = (double) sum / 5;
	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);
	    }
	}


