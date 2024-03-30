import java.util.*;

//here we create a class name as MergeTwoArray
class MergeTwoArray{
	public int []a1;
	public int []a2;
	public int []arr;

	MergeTwoArray(int a1[],int l1, int a2, int l2){
		for(int i=0; i<l1; i++){
			this.a1[i]=a1[i];
		}
		for(int i=0; i<l2; i++){
			this.a2[i]=a2[i];
		}
	}
	
	public int[] getMergeArray(){
		System.out.println(a1.length);
		for(int i=0; i<(l1+l2); i++){
			System.out.print(a1[i]+" ");
		}
		return a1;
	}
}
public class MergeApp{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter size of array: );
		//int size = sc.nextInt();
		int a1[] = new int[3];
		int a2[] = new int[4];
		System.out.println("Enter 3 elements in array: ");
		for(int i=0; i<a1.length; i++){
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter 4 elements in array: ");
		for(int i=0; i<a1.length; i++){
			a2[i]=sc.nextInt();
		}
		
		MergeTwoArray m = new MergeTwoArray(a1,3,a2,4);
		int []merged = m.getMergeArray();

		for(int i=0; i<merged.length; i++){
			System.out.print(merged[i]+" ");
		}
	}
}
