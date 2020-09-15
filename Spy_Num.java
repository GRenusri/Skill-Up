package prgs3;
import java.util.*;
public class Spy_Num 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number");
		int n=obj.nextInt();
		int num=n;
		int sum=0,mul=1;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num=num/10;
		}
		if(sum==mul)
		System.out.println(n+" is SPY number");
			else
				System.out.println(n+ " is NOT a Spy number");
	}

}
