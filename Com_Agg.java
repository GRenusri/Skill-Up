package pack4;
		
class A1 
 {
	 public void sum(int x , int y)
		{
			System.out.println("sum = " + (x+y));
		}
 }
	public class Com_Agg
	{
		public static void main(String[] args) 
		{
		 A1 obj = new A1();
		 obj.sum(20,10);
		 System.out.println("Main class");
		}
}	 	
