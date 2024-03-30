import java.util.*;

public class ReverseNo{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int a = sc.nextInt();
		
		int rem;
		int revno=0;
		while(a!=0){
			rem = a%10;
			revno=(revno*10)+rem ;
			a=a/10;
		}
		System.out.println("Reverse number is: "+revno);
	}
}