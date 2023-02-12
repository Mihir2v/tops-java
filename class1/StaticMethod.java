package class1;

public class StaticMethod {
	
	static int a=10;
	static int b;
	
	{
		System.out.println("BLock 1");
	}
	static void meth(int x)
	{
		System.out.println("A :"+a);
		System.out.println("B :"+b);
		System.out.println("X :"+x);
	}
	{
		System.out.println("BLock 2");
	}
	public StaticMethod() {
		System.out.println("Static Method Constructor");
	}
	static 
	{
		System.out.println("Static Block Initialized");
		b=a*4;
	}
	public static void main(String[] args) {
		meth(12);
		StaticMethod s=new StaticMethod();
	}
	{
		System.out.println("BLock 3");
	}

}
