import java.io.*;
import java.util.*;

public class ReadWriteImage{
	public static void main(String x[])throws Exception{
		Scanner sc = new Scanner(System.in);
		
		FileInputStream fr = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\UI\\boy.jpg");
		FileOutputStream fw = new FileOutputStream("C:\\Users\\Vaibhav\\Desktop\\JAVA\\boy.jpg");
		int data;
		while((data = fr.read()) != -1){
			fw.write(data);
		}
		fw.close();
		fr.close();
		System.out.println("Successfully copied Image and Paste at Location ");
	}
}