package pack2;
import java.util.*;

public class Student_Details 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter s.no");
		int sno=obj.nextInt();
		System.out.println("Enter name");
		String name=obj.next();
		System.out.println("Enter age");
		byte age=obj.nextByte();
		System.out.println("Enter fee");
		float fee=obj.nextFloat();
		System.out.println("Student details");
		System.out.println("sno="+sno+"name="+name+"age="+age+"fee="+fee);
		
		
		
		
	}

}
