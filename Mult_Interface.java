package pack4;


interface A
{
	void Display1();   
}
interface B
{
	void Display2();
}
class C implements A,B   
{
	public void Display1()
	{
		System.out.println("Interface - A");
	}
	public void Display2()
	{
		System.out.println("Interface - B");
	}
}
public class Mult_Interface
{
	public static void main(String[] args) 
	{
		C obj = new C();
       obj.Display1();
       obj.Display2();
} 
	}
