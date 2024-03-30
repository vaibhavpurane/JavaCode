import java.io.*;

public class ReadFile{
	public static void main(String x[])throws Exception, InterruptedException{
		File f = new File("C:\\Users\\Vaibhav\\Desktop\\JAVA\\wrdemo.txt");
		FileReader fr = new FileReader(f);
		//BufferedReader br = new BufferedReader(fr);
		//String data;
		int sum=0;
		//while((data = br.readLine())!= null){
			int letter;
			while((letter=fr.read())!= -1){
				if(letter>=48 && letter<=57){
					sum=sum+(letter-48);
				}
				System.out.println((char)letter);
			}
			//System.out.println((char)data);
		//}
		System.out.println("\nThe sum of numbers from string "+sum);
	}
}