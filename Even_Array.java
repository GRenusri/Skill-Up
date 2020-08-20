package pack3;

import java.util.Scanner;

public class Even_Array 
{

	public static void main(String[] args) 
	{
		Scanner e=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=e.nextInt();
		int a[]=new int[n];
		System.out.println("enter "+ n +" array values:");
		for(int i=0;i<n;i++)
		{
			a[i]=e.nextInt();
		
		}
		System.out.println("Values \t index");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
		      System.out.println(a[i] + "\t" +i);
			}
				
		}			

	}

}

