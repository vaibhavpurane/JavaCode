import java.util.*;
class Factorial{
	public int x;
	public void setValue(int x){
		this.x=x;
	}
	public int getFactorial(){
		int result=1;
		while(x!=0){
			result*=x;
			x--;
		}
		return result;
	}
}
public class FindFactorial{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		Factorial F = new Factorial();
		F.setValue(no);
		int result = F.getFactorial();
		System.out.println("Factorial of number is "+result);
	}
}
