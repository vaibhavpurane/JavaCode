import java.io.*;
import java.util.*;

public class WriteReadFile{
	public static void main(String x[])throws IOException{
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\Users\\Vaibhav\\Desktop\\JAVA\\wrdemo.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Enter multiple line string including numbers ");
		for(int i=0; i<3; i++){
			String data = sc.nextLine();
			bw.write(data);
			bw.newLine();
		}
		bw.close();
		fw.close();
		System.out.println("\nString data added successfully");
	}
}