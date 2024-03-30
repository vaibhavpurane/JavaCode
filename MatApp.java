import java.util.*;
public class MatApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[][] =new int[3][3];
		System.out.println("Enter values in array \n");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display array elements:\n");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]+"\t");
			}
			System.out.println("\n");
		}

	}
}