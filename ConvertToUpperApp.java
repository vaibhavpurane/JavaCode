import java.util.*;

class ConvertToUpper{
	private char c[];
	
	public void setCharArray(char ch[]){
		c=ch;
	}
	void convertToUpperCase(){
		for(int i=0; i<c.length; i++){
			if((int)c[i]>96 && (int)c[i]<122){
				c[i]=(char)((int)c[i]-32);
			}
		}
		System.out.println("After conversion :\t"+c);
	}
}
public class ConvertToUpperApp{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		char ch[] = new char[5];

		for(int i=0; i<5; i++){
			ch[i]=sc.next().charAt(0);
		}
		ConvertToUpper U = new ConvertToUpper();
		U.setCharArray(ch);
		U.convertToUpperCase();
	}
}