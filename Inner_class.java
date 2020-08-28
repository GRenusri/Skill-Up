package pack5;

class Outer_Class  
{
	int num = 10;	
	private class Inner_class    
	{
		int x= 20;
		public void print()
		{
			System.out.println("inside inner class :"+num +" "+ x);
		}
	} 
	void display_Inner()
	{		
		Inner_class obj = new Inner_class();
		obj.print();
		System.out.println("inner class value from outer class:"+obj.x);
	}
	
} 

public class Inner_class 
{
	public static void main(String[] args) 
	{
      Outer_Class obj = new Outer_Class();
      obj.display_Inner();
	}

}
