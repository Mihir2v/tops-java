package class1.Assignment;
import java.util.Scanner;

public class C {



	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter a year: ");
	        int year = scan.nextInt();
	        
	        boolean isLeap = false;
	        if (year % 400 == 0) {
	            isLeap = true;
	        } else if (year % 100 == 0) {
	            isLeap = false;
	        } else if (year % 4 == 0) {
	            isLeap = true;
	        }
	        
	        if (isLeap) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }
	}


