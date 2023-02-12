package class1;
class Student
{
	int rno;
	String sname;
	public Student() {
		System.out.println("Default Constructor Called");
	}
	public Student(int rno, String sname) {
		this();
		System.out.println("Paramiterized Constructor");
		this.rno = rno;
		this.sname = sname;
	}
	void display(Student s)
	{
		System.out.println("Roll No : "+s.rno);
		System.out.println("Student Name : "+s.sname);
	}
	void show()
	{
		this.display(this);
	}
}

public class thisKeyword {
	
	public static void main(String[] args) {
		Student s1=new Student(1,"Mihir");
		s1.show();
	}

}
