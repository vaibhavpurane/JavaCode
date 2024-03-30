import java.util.*;
abstract class Area {
	abstract void showArea();
}
class Circle extends Area {
	private int rad;

	public void setRadius(int rad){
		this.rad=rad;
	}
	public void showArea(){
		System.out.println("Area of Circle: "+(3.14*rad*rad));
	}
}
class Rectangle extends Area {
	private int len;
	private int wid;
	
	public void setLenWid(int len, int wid){
		this.len=len;
		this.wid=wid;
	}
	public void showArea(){
		System.out.println("Area of Rectangle: "+(len*wid));
	}
}
public class AreaApplication{
	public static void main(String []x){
		Circle C = new Circle();
		C.setRadius(4);
		C.showArea();

		Rectangle R = new Rectangle();
		R.setLenWid(9,4);
		R.showArea();
	}
}