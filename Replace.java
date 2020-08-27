package pack5;

public class Replace 
 {
	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("This were a test");
	sb.replace(5, 9, "is");
	System.out.println(sb);
	StringBuffer sb1 = new StringBuffer("Hello");
	  
	System.out.println(sb1.charAt(1)); 
	
	sb1.setCharAt(1, 'i');
	System.out.println(sb1);  
	
	sb1.setLength(2);
	System.out.println(sb1);
	}
 
}
