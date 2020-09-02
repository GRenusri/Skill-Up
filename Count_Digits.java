package Prgs1;
import java.util.*;

public class Count_Digits {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("enter number");
	int n=obj.nextInt();
	int c=0;
	while(n !=0)
	{
		n=n/10;
		c++;
	}
	System.out.println("No.of digits="+c);
	}

}
