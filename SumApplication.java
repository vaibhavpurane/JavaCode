import java.util.*;

class Sum{
	private int sum=0;
	
	public void calSum(int ...x){
		for(int i=0; i<x.length; i++){
			sum=sum+x[i];
		}
		System.out.println("The sum of given numbers is : "+sum);	
	}
}
public class SumApplication{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Sum s = new Sum();
		s.calSum(10,20,30);
		
	}
}