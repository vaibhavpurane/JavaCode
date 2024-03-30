import java.util.*;

//here we create a class name as Factorial
class Factorial{
	public int x;

	//setValue method for set value to instance member
	public void setValue(int x){
		this.x=x;
	}

	//below getFactorial method to calculate factorial of number
	public int getFactorial(){
		int fact=1;
		while(x!=0){
			fact=fact*x;
			x--;
		}
		return fact;
	}
}
public class FactorialApp{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		//here,take input from user in no variable
		System.out.println("Enter no for factorial: ");
		int no = sc.nextInt();
		
		//created class object 
		Factorial c = new Factorial();

		//here we call member method of class using class ref
		c.setValue(no);
		int result = c.getFactorial();
		System.out.println("Cube of no is: "+ result);
	}
}
