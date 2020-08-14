package pack1;
import java.util.*;

public class Circle_Area 
{
	public static void main(String[] args)
	
	{
		double pi=3.14;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter radius");
		int r=obj.nextInt();
	    double area=pi*r*r;	
	    System.out.println("Area of circle ="+area);
	
	}
}
