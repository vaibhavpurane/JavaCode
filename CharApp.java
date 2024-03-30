import java.util.*;

public class CharApp{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter character ");
		char ch = sc.next().char(0);
		//char ch = 'Z';
		
		int asci = (int)ch;
		if(asci>=48 && asci<=57){
			System.out.println("Ch is digit");
		}
		else if((asci>=65 && asci<=90) || (asci>=97 && asci<=122)){
			System.out.println("Ch is Alphabet");
		}
		else{
			System.out.println("Ch is Symbol");
		}

	}
}