import java.util.*;
public class UseCmdLineArgs{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Before swapping A is "+a+" B is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping A is "+a+" B is "+b);
	}
}