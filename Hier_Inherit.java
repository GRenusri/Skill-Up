package pack4;

class Student5  
{
	String name;   
	int rn;
	
	Student5(String name, int rno)
	{
		this.name =  name; 
		rn = rno;
	}
	
	void showStudent()
	{
		System.out.println("name = "+name +" rollno = "+rn);
	}
}
class Mark extends Student3 
{
	int m1,m2;  
	Mark(String name, int rn, int m1, int m2)  
	{
		super(name,rn);   
		this.m1 = m1;
		this.m2= m2;
	}
	void showMarks()
	{
		System.out.println("m1 = "+m1+" m2 = "+m2);
	}
}

class Marks2 extends Student5  
{
	int m3,m4;  
	Marks2(String name, int rn, int m3, int m4)  
	{
		super(name,rn);   
		this.m3 = m3;
		this.m4 = m4;
	}
	void showMarks()
	{
		System.out.println("m3 = "+m3+" m4 = "+m4);
	}
}


public class Hier_Inherit 
{
	public static void main(String[] args) 
{
   Marks1 obj = new Marks1("sai",10,67,78);
     obj.showStudent();
     obj.showMarks();
   Marks2 obj2 = new Marks2("sai",10,87,76);
     obj2.showStudent();
     obj2.showMarks();
	}
}
