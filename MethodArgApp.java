import java.util.*;

class add{
	public void sum(String name, int ...xx){
		int s=0;
		for(int i=0; i<xx.length; i++){
			s=s+xx[i];
		}
		System.out.println("Sum is "+s);
	}
}

public class MethodArgApp{
	public static void main(String x[]){
		add a = new add();
		a.sum("Vaibhav", 1,2,3,4,5);
	}
}