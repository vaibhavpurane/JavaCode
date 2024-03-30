import java.io.*;

public class NewIOReadFile{
	public static void main(String x[])throws IOException, InterruptedException
{
		File f = new File("C:\\Users\\Vaibhav\\Desktop\\JAVA\\writedemo.txt");
		FileReader fr = new FileReader(f);
		int data;
		int count = 1;
		while((data=fr.read()) != -1){
			if(data==32){
				count++;
			}
			System.out.print((char)data);
		}
		System.out.println("\nTotal number of Words in file are: "+count);
	}
}