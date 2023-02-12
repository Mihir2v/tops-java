package class1.Assignment;
//Write a Java program to Take three numbers from the user and print the greatest
//number. 

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter x :");
		x=sc.nextInt();
		
		System.out.print("Enter y :");
		y=sc.nextInt();
		
		System.out.print("Enter z :");
		z=sc.nextInt();

		if(x>y)
		{
			if(x>z) 
			{
			System.out.println("x is greater number which is " +x);
			}
			else 
			{
				System.out.println("z is greater number which is "+z);
			}
		}
		else if(y>z)
		{
			System.out.println("y is greater number which is "+y);
		}
		else
		{
			System.out.println("z is greater number which is "+z);
		}
	
	}
}
