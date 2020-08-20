package pack2;

public class Letter_For 
{

	public static void main(String[] args) 
	{
		System.out.println("Print letters");
        for(char i='A';i<='E';i++)
        {
        	for(char j='A';j<=i;j++)
        	{
        		System.out.print(" "+j);
        		
        	}
        	System.out.println();
        	
        }
	}

}
