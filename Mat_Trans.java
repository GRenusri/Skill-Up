package pack3;
import java.util.*;

public class Mat_Trans 
{

	public static void main(String[] args) 
	{
		Scanner m=new Scanner(System.in);
		System.out.println("Enter row size");
		int r=m.nextInt();
		System.out.println("Enter column");
		int c=m.nextInt();
		int a[][]=new int[r][c];
		System.out.println("enter "+r+" x "+c+" array values");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=m.nextInt();
			}
		}
		System.out.println("Matrix array values");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix array values");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}

}
