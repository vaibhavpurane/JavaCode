import java.util.*;
class SortArr{
	public int arr[];
	public void setArray(int a[]){
		this.arr=new int[a.length];
		for(int i=0; i<a.length; i++){
			this.arr[i]=a[i];
		}
	}
	public int[] getSortArray(){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
public class SortingArray{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		System.out.println("Enter elements in array ");
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		SortArr S = new SortArr();
		S.setArray(arr);
		int a[] = new int[arr.length];
		a=S.getSortArray();
		System.out.println("Array after sorted ");
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}