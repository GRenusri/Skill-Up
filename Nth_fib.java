package Prgs1;
import java.util.*;
public class Nth_fib {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int a=0,b=1,c=0;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("Fibonacci number="+c);
	}

}
