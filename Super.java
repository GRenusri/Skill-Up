package pack4;

class Add2  
{
	int a=100,b = 20;
	void add()
	{		 
		System.out.println(" Add = "+(a+b));
	}
}
class Sub2 extends Add2  
{
	void sub()
	{		
		super.add();
		System.out.println("sub = "+(super.a-super.b));
	}
}
public class Super
{
	public static void main(String[] args) 
	{
       Sub2 obj = new Sub2();
       obj.sub();       
	}
}

