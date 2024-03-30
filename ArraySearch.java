import java.util.*;

public class ArraySearch{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int arr[];		
		System.out.println("Enter array size ");
		int size = sc.nextInt();
		arr = new int[size];
		
		System.out.println("Enter elements in array ");
		for(int i=0;i<arr.length; i++){
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("Array elements are: ");
		for(int i=0; i<arr.length; i++){
			System.out.printf(arr[i]+" ");
		}
		
		System.out.println("Occurance in array: ");
		
		for(int i=0; i<arr.length; i++){
			int count=1;
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			
				System.out.printf("%d --> %d",arr[i],count);
			
			//if(arr[i-1]==arr[i]){
			//	count++;
			//}
			
			//else if(arr[i-1]!=arr[i]){
			//	System.out.printf("%d --> %d",arr[i-1],count);
			//	count=1;
			//}
			//else{
			//	System.out.printf("%d --> %d",arr[i],count);
			//}
		}
	}
}