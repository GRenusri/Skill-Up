package pack6;

abstract class AnonymousInner
{
	public abstract void myMethod();
}
public class  Anonymous_Inner
{
	public static void main(String[] args) 
	{
		AnonymousInner inner =new AnonymousInner()  
		{                            
			public void myMethod()
			{
				System.out.println("Anonymous Inner Class");
			}
		};	
	inner.myMethod();  	
} }
