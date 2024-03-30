import java.util.*;

public class ReverseNumber{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int no = sc.nextInt();
		int Revno=0;
		while(no>0){
			Revno = Revno*10 + (no%10);
			no=no/10;
		}
		System.out.println("REverse Number is "+Revno);
	}
}