package class1;

public class JumpingStatement {
	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++)
		{
			if(i==5)
			{
				continue;
//				break;	
			}
			else
			{
				System.out.println("I :"+i);
			}
		}
	}

}
