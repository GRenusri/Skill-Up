package pack1;
import java.util.*;

public class Hexagon {

	public static void main(String[] args) {
		Scanner h=new Scanner(System.in);
		System.out.println("Enter side");
		int s=h.nextInt();
		double area=1.73*s*s;
        System.out.println("Hexagon area="+area);
        System.out.printf("%1.2f",area);
	}

}
