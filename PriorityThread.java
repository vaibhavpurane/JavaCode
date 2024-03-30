import java.lang.*;
import java.util.*;
class A implements Runnable{
	protected int no;
	A(int no){
		this.no = no ;
	}

	public void run(){
		try{
		    for(int i=1; i<no; i++){
			System.out.println("Number = "+i);
			
		    }
		    Thread.sleep(1000000);
		}
		catch(Exception ex){
			System.out.println("Error is "+ex);
		}
	}
}
class B implements Runnable{
	protected int no;
	B(int no){
		this.no=no;
	}
	public void run(){
		try{
		   for(int i=1; i<no; i++){
			if(no%i==0){
				System.out.println("Divisor : "+i);
				Thread.sleep(10000);
			}
		   }
		}
		catch(Exception ex){
			System.out.println("Error is "+ex);
		}
	}
}
class C extends A,B implements Runnable{
	C(int no){
		super(no);
	}
	public void run(){
		try{
		    for(int i=1; i<no; i++){
			if(no%i!=0){
				System.out.println("Non Divisor - "+i);
				
			}
			Thread.sleep(100000);
		    }
		}
		catch(Exception ex){
			System.out.println("Error is "+ex);
		}
	}
}
public class PriorityThread{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int no = sc.nextInt();
		A a1 = new A(no);
		Thread a = new Thread(a1);
		a.start();
		B b1 = new B(no);
		Thread b = new Thread(b1);
		b.start();
		C c1 = new C(no);
		Thread c = new Thread(c1);
		c.start();
	}
}