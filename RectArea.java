import java.util.*;

class Rectangle{
	int len, wid;
	void setLengthWidth(int len, int wid){
		this.len=len;
		this.wid=wid;
	}
	void showarea(){
		System.out.println("Area of Rectangle is: "+ len*wid); 
	}
}

public class RectArea{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Rectangle R1 = new Rectangle();
		int length, width;
		System.out.println("Enter length and width of rectangle\n");
		length=sc.nextInt();
		width = sc.nextInt();
		R1.setLengthWidth(length, width);
		R1.showarea();

	}
}