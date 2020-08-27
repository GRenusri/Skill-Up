package pack4;

class Bank
{
  String name;
  int acc_no;
  
  Bank()  
  {
	  name = "naveen";
	  acc_no = 11;
  }
  
  Bank(String name)  
  {
	  this.name = name;
	  acc_no = 12;
  }
  Bank(String name, int acc_no)
  {
	  this.name =name;
	  this.acc_no = acc_no;
  }
  
  void Show()
  {
	  System.out.println("name = "+name+" acc_no = "+acc_no);
  }
}

public class Over_Const
{
	public static void main(String[] args) 
	{
Bank obj1 = new Bank();
obj1.Show();
Bank obj2 = new Bank("suresh");
obj2.Show();
Bank obj3 = new Bank("sai",13);
obj3.Show();
} }
