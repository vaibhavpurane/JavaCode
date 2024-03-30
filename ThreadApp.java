import java.lang.*;
class A extends Thread
{   public void run(){
      try{
	for(int i=1; i<=5; i++)
	{ System.out.printf("First = %d\t%b\n",i,isAlive());
		
	   sleep(10);
	}
      }
      catch(Exception ex)
      { System.out.println("Error is "+ex);
      }
    }
}
class B extends Thread
{    public void run(){
      try{
	for(int i=1; i<=50; i++)
	{ System.out.printf("Second = %d\n",i);
	   sleep(100); 
	}
      }
      catch(Exception ex)
      { System.out.println("Error is "+ex);
      }
    }
}

public class ThreadApp
{
    public static void main(String x[])throws InterruptedException
    {
	A a = new A();
	a.start();
	a.join();
	System.out.printf("First Thread status %b\n",a.isAlive());
	B b1 = new B();
	b1.start();
    }
}
