import java.util.*;
class CheckChar{
	public char ch;
	public void setChar(char ch){
		this.ch=ch;
	}
	public boolean checkChar(){
		boolean res=false;
		if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
			res=true;
		}
		else if(ch>=48 && ch<=57){
			res=true;
		}
		return res;
	}
}
public class FindCheckChar{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		CheckChar C = new CheckChar();
		C.setChar(ch);
		boolean result = C.checkChar();
		if(result){
			System.out.println("Character is Alphabet or Digit");
		}
		else{
			System.out.println("Character is special Symbol");
		}
	}
}	