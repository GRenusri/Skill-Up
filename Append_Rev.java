package pack5;

public class Append_Rev
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Renu");
		System.out.println("old data : "+ sb1);
		sb1 = sb1.append(" Garapati");
		System.out.println("new data :"+sb1);
		StringBuffer sb2 = new StringBuffer("RenuSri");
		System.out.println("reverse = "+sb2.reverse());
	}
}
