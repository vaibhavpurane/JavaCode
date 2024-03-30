import java.util.*;

interface CharOperator{
	void setCharArr(char []ch);
	char [] getArrResult();
}
class ConvertToUpper implements CharOperator{
	public char []ch;
	public void setCharArr(char[] ch){
		this.ch=ch;
	}
	public char[] getArrResult(){
		for(int i=0; i<ch.length; i++){
			ch[i] = ch[i].toUpperCase();
		}
		return ch;
	}
}
class ChangeAlternateChar implements CharOperator{
	public char []ch;
	public void setCharArr(char[] ch){
		this.ch=ch;
	}
	public char[] getArrResult(){
		for(int i=0; i<ch.length; i++){
			if(i%2==0){
				ch[i] = ch[i].toUpperCase();
			}
			else{
				ch[i] = ch[i].toLower();
			}
		}
		return ch;
	}
}
public class CharInterfaceApp{
	public static void main(String []x){
		
		char []ch = {'a','B','C','d'};

		ConvertToUpper c = new ConvertToUpper();
		c.setCharArr(ch);
		c.getArrResult();
		
		ChangeAlternateChar c1 = new ChangeAlternateChar();
		c1.setCharArr(ch);
		c1.getArrResult();
	}
}