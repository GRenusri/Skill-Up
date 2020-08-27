package pack4;
class A2
{
	public void sum(int x , int y)
	{
		System.out.println("sum = " + (x+y));
	}
}

class B1
{
	public void sub(int a, int b)
	{
		System.out.println("sub = "+ (a-b));
	}
}


public class Mul_Class
{
	public static void main(String[] args) 
	{
	 A2 obj = new A2();
	 obj.sum(20,10);
	 B1 obj2 = new B1();
	 obj2.sub(30, 10);
	 System.out.println("Main class");
	}
}
