import java.util.*;
public class ReverseInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		int revno=0;
		System.out.println("Orignal number is "+no);
		while(no!=0) {
			revno = revno*10 + (no%10);
			no/=10;
		}
		System.out.println("Reversed Number is "+revno);
	}
}