import java.util.*;

class Circle{
	float radius,PI;
	Circle(float PI){
		this.PI=PI;
	}
	void setRadius(float radius){
		this.radius=radius;
	}
	void showarea(){
		System.out.println(PI*radius*radius);
	}
}
public class Areaa{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		float PI=3.14f;
		Circle C1 = new Circle(PI);
		System.out.println("Enter raduis");
		float radius = sc.nextFloat();
		C1.setRadius(radius);
		System.out.println("Area of Circle is \n");
		C1.showarea();
	}
}