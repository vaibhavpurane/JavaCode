import java.util.*;
class Cube{
	public int no;
	public void setValue(int no){
		this.no=no;
	}
	public int getCube(){
		return no*no*no;
	}
}
public class FindCube{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Cube c = new Cube();
		System.out.println("Enter a number ");
		int no = sc.nextInt();
		c.setValue(no);
		int result = c.getCube();
		System.out.println("Cube is : "+result);
	}
}