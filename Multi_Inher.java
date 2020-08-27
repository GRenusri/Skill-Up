package pack4;

class Studentc  
{
	String name;  
	int rollno;
	
	Studentc(String name , int rn)  
	{
	  this.name = name;  
	  rollno = rn;
	}
	void Display()
	{
		System.out.println("name = "+name+" rollno = "+rollno);
	}
}

class Marks3 extends Studentc  
{
	int m1,m2;
	Marks3(String name , int rn, int m1, int m2)  
	{
		super(name,rn);
		this.m1 = m1;
		this.m2 = m2;		
	}
	void Display1()
	{
		System.out.println("m1 = "+m1+" m2 = "+m2);
	}
}
class Marks4 extends Marks3 
{
	int m3,m4;
	Marks4(String name,int rn,int m1,int m2,int m3,int m4)
	{
		super(name,rn,m1,m2);
		this.m3 = m3;
		this.m4 = m4;		
	}
	void Display2()
	{
		System.out.println("m3 = "+m3+" m4 = "+m4);
	}
}

public class Multi_Inher
{
	public static void main(String[] args) 
	{
Marks4 obj = new Marks4("sai",11,56,67,78,89);	
obj.Display();
obj.Display1();
obj.Display2();
	}
}

