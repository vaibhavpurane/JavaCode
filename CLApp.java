import java.util.*;

public class CLApp{
	public static void main(String []x){
		int a,b,c;
		a=Integer.parseInt(x[0]);
		b=Integer.parseInt(x[1]);
		
		System.out.println("Before swapping "+a+"  "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping "+a+"  "+b);
	}
}