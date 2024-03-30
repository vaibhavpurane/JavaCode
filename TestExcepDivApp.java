import java.util.*;
public class TestExcepDivApp{
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two values:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		try{
		   c=a/b;
		   System.out.println("Division is: "+c);
		}
		catch(ArithmeticException ex) {
		   System.out.println("Error is "+ex);
		}
		System.out.println("logic 1"); 
		System.out.println("logic 2");
		System.out.println("logic 3");
	}
}