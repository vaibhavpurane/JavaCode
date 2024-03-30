import java.util.Scanner;

interface ArrayOperation{
	void performOperation(int x[],int size);
}
class Sorting implements ArrayOperation{
	public void performOperation(int x[],int size) {
		for (int i = 0; i <size-1; i++) {
			for (int j = i+1; j < size; j++) {
				if(x[i]>x[j]) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("Array after sorting");
		for (int i = 0; i < size; i++) {
			System.out.print(x[i]+" ");
		}
	}
}
class Insertion implements ArrayOperation{
	int value,index;
	void setValue(int value,int index) {
		this.value=value;
		this.index=index;
	}
	public void performOperation(int x[],int size) {
		for (int i =x.length-2; i >=index; i--) {
			x[i+1]=x[i];
		}
		x[index]=value;
		System.out.println("Array after Inserting");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
	}
}
class Deletion implements ArrayOperation{
	int index;
	void setIndex(int index) {
		this.index=index;
	}
	public void performOperation(int x[],int size) {
		for (int i = index; i < x.length-1; i++) {
			x[i]=x[i+1];
		}
		System.out.println("Array after Deleting");
		for (int i = 0; i < x.length-1; i++) {
			System.out.print(x[i]+" ");
		}
	}
}
class Rev implements ArrayOperation{
	public void performOperation(int x[],int size) {
		int s=0;
		int end=x.length-2;
		int mid=(x.length-2)/2;
		for(s=0;s<mid;s++) {
			int temp=x[s];
			x[s]=x[end];
			x[end]=temp;
			end--;
		}
		System.out.println("\nArray after Reverse");
		for (int i = 0; i < x.length-1; i++) {
			System.out.print(x[i]+" ");
		}
	}
}
public class OperationApp {
    static int size=5;
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
        int x[]=new int[size+1];
		System.out.println("Enter the array elements :");
		for (int i = 0; i < size; i++) {
			x[i]=sc.nextInt();
		}
      do{
        System.out.println("\n1 sort elements");
        System.out.println("2 insert elements");
	System.out.println("3 delete elements");
	System.out.println("4 reverse array");
	System.out.println("Enter choice");
	int choice=sc.nextInt();
	switch(choice){
         case 1:
      	 	Sorting obj=new Sorting();
      		obj.performOperation(x,size);
	    break;
	 case 2:	    
      		Insertion obj1=new Insertion();
      		System.out.println("\nenter value and index to insert..");
      		int value=sc.nextInt();
      		int index=sc.nextInt();
      		obj1.setValue(value,index);
      		obj1.performOperation(x,size);
            break;
 	 case 3:
      	 	Deletion obj2=new Deletion();
      		System.out.println("\nEnter index to delete value..");
      		int indx=sc.nextInt();
      		obj2.setIndex(indx);
      		obj2.performOperation(x, size);
            break;
 	 case 4:
      		Rev obj3=new Rev();
      		obj3.performOperation(x, size);
             break;
	  }
      	}while(true);
      
	}

}