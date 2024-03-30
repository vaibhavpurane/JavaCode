import java.util.*;

public class arrApp{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		
		int arr[][]=new int[3][3];
		
		System.out.println("Enter elements in array: ");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements of array are: ");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
} 