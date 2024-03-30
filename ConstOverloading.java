class Cube {
	int no;
	float value;
	Cube(int no) {
		this.no = no;
	}
	Cube(float value) {
		this.value = value;
	}
	int getIntCube() {
		return no * no * no;
	}
	float getFloatCube() {
		return value * value * value;
	}
}
public class ConstOverloading {
	public static void main(String x[]) {
		 int intCube =new Cube(5).getIntCube();
		 float floatCube=new Cube(5.5f).getFloatCube();
		 System.out.println("Cube of integer is "+intCube);
		 System.out.println("Cube of float is  "+floatCube);	 
	}
}
