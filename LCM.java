package Prgs1;

import java.util.Scanner;

public class LCM 
{

	public static void main(String[] args) 
	{
		Scanner l=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int x=l.nextInt();
		int y=l.nextInt();
		int gcd=1;
		for(int i=1;i<=x&&i<=y;i++)
		{
			if(x%i==0&&y%i==0)
				gcd =i;
		}
		int lcm=(x*y)/gcd;
		System.out.println("LCM ="+lcm);
	}

}
