import java.util.*;

public class LowerToUpercase{
	public static void main(String []x){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc.nextLine();
		String S="";
		char s='';
		System.out.println("Before conversion "+str);
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)>=97 && str.charAt(i)<=122){
				s =(char)(str.charAt(i)-32);
			}
			S=S+s;
		}
		System.out.println("After conversion "+S);
	}
}