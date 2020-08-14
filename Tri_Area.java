package pack1;

import java.util.Scanner;

public class Tri_Area {

	public static void main(String[] args) 
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter base");
		int b=t.nextInt();
		System.out.println("Enter height");
		int h=t.nextInt();
		double area=0.5*h*b;
		System.out.println("Triangle area="+area);
	  

	}

}
