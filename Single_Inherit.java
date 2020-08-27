package pack4;

class Student3   
{
	String name;   
	int rn;
	
	Student3(String name, int rno) 
	{
		this.name =  name; 
		rn = rno;
	}
	
	void showStudent()
	{
		System.out.println("name = "+name +" rollno = "+rn);  
	}
}
class Marks1 extends Student3  
{
	int m1,m2;  
	Marks1(String name, int rn, int m1, int m2)  
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
public class Single_Inherit
{
	public static void main(String[] args) 
	{
   Marks1 obj = new Marks1("sai",10,67,78);
     obj.showStudent();
     obj.showMarks();
	}
}

