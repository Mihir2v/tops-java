/*
 * If Condition
 * 
 * 1. Simple If
 * 
 * 2. if/else
 * 
 * 3. Nested if/else
 * 
 * 4. Ladder if/else
 * 
 * 
 */
package class1;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A :");
		a=sc.nextInt();
		
		System.out.print("Enter B :");
		b=sc.nextInt();
		
		System.out.print("Enter C :");
		c=sc.nextInt();
		
//		if(a>0) positive - negative
//		if(a%2==0) Even - Odd
//		if(a>b) <>
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Greater Number");
			}
			else
			{
				System.out.println("C is Greater Number");
			}
		}
		else if(b>c)
		{
			System.out.println("B is Greater Number");
		}
		else
		{
			System.out.println("C is Greater Number");
		}
	}

}
