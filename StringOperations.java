import java.util.*;
class Operations{
	private String str;
	
	public Operations(String str){
		this.str=str;
		char ch[] = str.toCharArray();
	}
	public void reversestr() {
		int end = ch.length-1;
		int mid = (ch.length-1)/2 ;
		for(int i = 0; i<=mid; i++){
			char c = ch[i];
			ch[i] = ch[end];
			ch[end] = c;
			end--;
		}
		System.out.println("Reverse string: "+str);
		for(int i=0; i<ch.length; i++){
			System.out.print(ch[i]);
		}	
		
	}
	public void reverseWord(){
		
	}
}
	
public class StringOperations {
	public static void main(String []args){
		Operations obj = new Operations("I am indian");
		obj.reversestr();
		obj.reverseWord();

	}
}