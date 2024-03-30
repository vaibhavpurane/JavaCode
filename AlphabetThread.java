import java.lang.*;
import java.util.*;
class A extends Thread{
	public void run(){
		try{
			for(int i=65; i<=90; i++){
				System.out.println((char)i+"\t");
				sleep(100);
			}
		}
		catch(Exception ex){
			System.out.println("Erroe is "+ex);
		}
	}
}
class B extends Thread{
	public void run(){
		try{
			for(int i=97; i<=122; i++){
				System.out.println((char)i+"\t");
				sleep(100);
			}
		}
		catch(Exception ex){
			System.out.println("Erroe is "+ex);
		}
	}
}
public class AlphabetThread{
	public static void main(String []x)throws InterruptedException{
		A a1 = new A();
		a1.start();
		a1.join();
		B b1 = new B();
		b1.start();
	}
}