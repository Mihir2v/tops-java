package class1;
class Box
// Also Known as Constructor Overloading
{
	double width,height,depth;
	Box()
	{
		System.out.println("Default Constructor Called");
		width=3;
		height=5;
		depth=7;
	}
	Box(double w,double h,double d)
	{
		System.out.println("Parameterized Constructor");
		width=w;
		height=h;
		depth=d;
	}
	Box(Box b)
	{
		System.out.println("Copy COnstructor");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	void volume()
	{
		System.out.println("Volume : "+(width*height*depth));
	}
}


public class Constructor {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume();
		
		Box b2=new Box(5,6,7);
		b2.volume();
		
		Box b3=new Box(b2);
		b3.volume();
	}

}
