package pack2;
import java.util.*;

public class Nested_If_else 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter 4 nos:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		int d=obj.nextInt();
		if(a>b&&a>c&&a>d)
        System.out.println("big no="+a);
        else if(b>c&&b>d)
        System.out.println("big no="+b);
        else if(c>d)
        System.out.println("big no="+c);
        else
        System.out.println("big no="+d);
	
	}

}
