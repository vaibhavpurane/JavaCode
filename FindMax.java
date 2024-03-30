import java.util.*;
class findMaxx{
	public int arr[];
	public void setArray(int a[]){
		this.arr=a.clone();
	}
	public int getMax(){
		int max=arr[0];
		for(int i=1; i<arr.length; i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
}
public class FindMax{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("Enter elemetns in array ");
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		findMaxx f = new findMaxx();
		f.setArray(arr);
		int result=f.getMax();
		System.out.println("Max element of array is "+result);
	}
}