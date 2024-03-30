import java.util.*;

class Area{
	float radius,result,PI;
	Area(){
		System.out.println("Hello, motto");
	}
	Area(float PI){
		this.PI=PI;
	}       
	void setRadius(float radius){
		this.radius=radius;
	}
	void Result(){
		System.out.println(PI*radius*radius);
	}
}
public class AreaApp{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		float PI=3.14f;
		Area a1=new Area(PI);
		System.out.println("Enter Radius of Circle");	
		float radius = sc.nextFloat();
		a1.setRadius(radius);

		System.out.println("Value assigned ti instance variable is "+a1.radius);	
	
		a1.Result();
	}

}