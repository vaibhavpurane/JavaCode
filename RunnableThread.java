import java.lang.*;

class Test implements Runnable{
	public void run(){
		try{
			for(int i=1; i<=5; i++){
				System.out.println("I = "+i);
				Thread.sleep(100);
			}
		}
		catch(Exception ex){
			System.out.println("Error is: "+ex);
		}
	}
}
public class RunnableThread{
	public static void main(String x[]){
		Test t = new Test();
		Thread T = new Thread(t);
		T.start();
	}
}
		