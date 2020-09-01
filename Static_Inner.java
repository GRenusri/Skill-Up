package pack6;

class Static_Class  
{
	static class Nested_Class  
	{
		public void myMethod()
		{
			System.out.println("static nested class");
		}
	}
}
public class Static_Inner
{
	public static void main(String[] args)   
	{
	  Static_Class.Nested_Class obj = new Static_Class.Nested_Class();
	  obj.myMethod();
	}
}
