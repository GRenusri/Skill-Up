package pack6;

class Static_class  
{
	static class Nested_Class 
	{
		static class Inner_Class  
		{
			public void Method2()
			{
				System.out.println("static inner class2");
			}
		}
	}
}
public class Multi_StaticInner
{
	public static void main(String[] args)   
	{
 Static_class.Nested_Class.Inner_Class obj = new Static_class.Nested_Class.Inner_Class();
	  obj.Method2();
	}
}
