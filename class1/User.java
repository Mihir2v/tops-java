package class1;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		int a,b,c;
		
// Taking Values By Scanner 
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter A :");
	a=sc.nextInt();
	
	System.out.print("Enter B :");
	b=sc.nextInt();
	
//	Basic Calculation
	
	c=a+b;
	System.out.println("Addition =" +c);
	
	c=a-b;
	System.out.println("Subtraction =" +c);
	
	c=a*b;
	System.out.println("Multiplication =" +c);
	
	c=a/b;
	System.out.println("Division  =" +c);
	
	
	

}
}