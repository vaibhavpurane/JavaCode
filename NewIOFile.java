import java.io.*;
import java.util.*;

public class NewIOFile{
	public static void main(String x[])throws IOException{
		Scanner sc = new Scanner(System.in);
		
		
		FileWriter fw = new FileWriter("C:\\Users\\Vaibhav\\Desktop\\JAVA\\writedemo.txt");
		
		System.out.println("Enter string ");
		String data = sc.nextLine();
		fw.write(data);
		fw.close();
		System.out.println("Data write successfully ");
	}
}
			