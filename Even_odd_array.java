package Prgs1;
import java.util.*;

public class Even_odd_array 
{

	public static void main(String[] args) 
	{
		Scanner obj =new Scanner(System.in);
		System.out.println("enter size");
		int s=obj.nextInt();
		int [] nums = new int[s];
		int even=0, odd=0;
		System.out.println("enter" +s+"values");
		for(int i=0;i<s;i++)
		{
			nums[i]=obj.nextInt();
		}
		for(int i=0;i<s;i++)
		{
			if(nums[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Even count="+even);
		System.out.println("Odd count="+odd);
		
	
		
		
	}

}
