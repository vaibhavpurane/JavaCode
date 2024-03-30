import java.io.*;
import java.util.*;

public class WriteApp{
	public static void main(String x[])throws Exception
{
		Scanner sc = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:\\Users\\Vaibhav\\Desktop\\JAVA\\writeapp.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		System.out.println("Enter string data ");
		String data = sc.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Succesully write data in file ");

		FileReader fr = new FileReader("C:\\Users\\Vaibhav\\Desktop\\JAVA\\writeapp.txt");
		BufferedReader br = new BufferedReader(fr);
		int rdata;
		while((rdata = br.read()) != -1){
			System.out.print((char)rdata);
		}

		
	}
}