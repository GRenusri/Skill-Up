package pack2;
import java.util.*;

public class Switch {

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter 2 nos");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("4.Div");
		System.out.println("Enter choose 1...4");
		int ch =obj.nextInt();
		switch(ch)
		{
			case 1:System.out.println("1.Add="+(a+b));
		             break;
		    case 2:System.out.println("2.Sub="+(a-b));
		             break;
		    case 3:System.out.println("3.mul="+(a*b));
		             break;
		    case 4:System.out.println("4.Div="+(a%b));
		             break;
		    default :System.out.println("invalid");         
		}
		
		
				
	}

}
