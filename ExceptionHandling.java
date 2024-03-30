import java.util.*;

public class ExceptionHandling{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 NullPointerException");
		System.out.println("2 ArithmeticException");
		System.out.println("3 ClassCastException");
		System.out.println("4 ClassNotFoundException");
		System.out.println("Enter choice ");
		int ch=sc.nextInt();

		switch(ch){
			case 1:
				try{
					String s="";
					System.out.println(s.length());
				}
				catch(NullPointerException ex){
					System.out.println("Error "+ ex);
				} 
			case 2:
				try{
					int a = 9/0;
					System.out.println(a);
				}
				catch(ArithmeticException ex){
					System.out.println("Error "+ ex);
				} 
			case 3:
				try{
					Object obj = new Integer(10);
					String str = Integer(obj);
				}
				catch(ClassCastException ex){
					System.out.println("Error "+ ex);
				} 
			case 4:
				try{
					class.forName("NewClass");
					System.out.println("new class found");
				}
				catch(ClassNotFoundException){
					System.out.println("Error "+ ex);
				} 
		}
	}
}