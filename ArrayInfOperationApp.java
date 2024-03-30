import java.util.*;

interface ArrayOperation {
	void performOperation(int x[], size);
}
class Sorting implements ArrayOperation{
	public void performOperation(int x[], size) {
		for(int i=0; i<size-1; i++){
			for(int j=i+1; j<size; j++){
				if(x[i]>x[j]){
					int temp = x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("Array after sorting ");
		for(int i=0;i<size; i++){
			System.out.println(x[i]+" ");
		}	
	}
}
class Insertion implements ArrayOperation {
	int value, index;
	void setValue(int value, int index){
		this.value=value;
		this.index=index;
	}	
	public void performOperation(int x[], int size) {
		for(int i= x.length-2; i>=index; i++){
			x[i+1] = x[i];
		}
		x[index] = value;
		System.out.println("Array after inserting");
		for(int i = 0; i < x.length; i++){
			System.out.println(x[i]+" ");
		}	
	}
}
class Deletion implements ArrayOperation {
	int index;
	void setIndex(int index){
		this.index=index;
	}
	public void performOperation(int x[], int size) {
		for(int i = index; i<x.length-1; i++) {
			x[i]=x[i+1];
		}
		System.out.println("Array after deleting ");
		for(int i = 0; i < x.length-1; i++){
			System.out.println(x[i]+" ");
		}
	}
}
class Rev Implements ArrayOperation {
	public void performOperation(int x[], int size){
		int s=0;
		int end = x.length-2;
		int mid = (x.length-2)/2;
		for(s=0;s<mid;s++) {
			int temp = x[s];
			x[s] = x[end];
			x[end] = temp;
			end--;
		}
		System.out.println("Array after reverse ");
		for(int i = 0; i < x.length-1; i++){
			System.out.println(x[i]+" ");
		}
	}
}

public class ArrayInfOperationApp {
	static int size = 5;
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		int x[]=new int[size+1];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++){
			x[i]=sc.nextInt();
		}
		Sorting obj = new Sorting();
		obj.performOperation(x,size);

		Insertion obj1 = new Sorting();
		System.out.println("Enter value and index to insert...");
			
	}
}
		