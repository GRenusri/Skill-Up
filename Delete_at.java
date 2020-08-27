package pack5;

public class Delete_at 
{
	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("This is so beautiful");
	System.out.println(sb.delete(4, 7));  
	System.out.println(sb.deleteCharAt(0));
	}
}
