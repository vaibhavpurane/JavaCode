import java.io.*;
import java.util.*;

public class WriteReadByStream{
	public static void main(String x[])throws Exception{
		Scanner sc = new Scanner(System.in);	
	
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Vaibhav\\Desktop\\JAVA\\wrbyStream.txt", true);
	
		System.out.println("Enter data in file ");
		String msg = sc.nextLine();
	
		byte b[] = msg.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Data Save successfully ");

		System.out.println("Now Read the data from file: "); 
		FileInputStream finf = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\JAVA\\wrbyStream.txt");
		int data;
		while((data = finf.read()) != -1){
			System.out.print((char)data);
		}
	
	}
}
	