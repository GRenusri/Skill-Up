package pack5;


 class A
{
	void show()
	{
		System.out.println("final class");	
	}
}
class B extends A  
{
	void display()
	{
		System.out.println("child class");
	}
}
public class Final_modifier
{
	public static void main(String[] args) 
	{
A obj = new A();
obj.show();
	}
}
