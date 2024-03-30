import java.util.*;

//here we create a class name as Cube
class Cube{
	public int x;

	//setValue method for set value to instance member
	public void setValue(int x){
		this.x=x;
	}

	//below getCube method to calculate cube of number
	public int getCube(){
		return x*x*x ;
	}
}
public class CubeApp{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		//here,take input from user in no variable
		System.out.println("Enter no for cube: ");
		int no = sc.nextInt();
		
		//created class object 
		Cube c = new Cube();

		//here we call member method of class using class ref
		c.setValue(no);
		int result = c.getCube();
		System.out.println("Cube of no is: "+ result);
	}
}
