import java.lang.*;
import java.util.*;
class A extends Thread{
	private int no;
	A(int no){
		this.no = no;
	}
	public void run(){
		try{
		   for(int i=1; i<no; i++){
			if(i%2==0){
				System.out.println("Even no: "+i);
			}
		    }
		}
		catch(Exception ex){
		    System.out.println("Error is "+ex);    
		}
	}
}
class B extends Thread{
	private int no;
	B(int no){
		this.no = no;
	}
	public void run(){
		try{
		   for(int i=1; i<no; i++){
			if(i%2!=0){
				System.out.println("Odd no: "+i);
			}
		    }
		}
		catch(Exception ex){
		    System.out.println("Error is "+ex);    
		}
	}
}
public class EvenOddThread{
	public static void main(String []args)throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no = sc.nextInt();
		A a1 = new A(no);
		a1.start();
		B b1 = new B(no);
		b1.start();
	}
}		