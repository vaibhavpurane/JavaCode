import java.util.*;

class Employee{
	private int id;
	private String name;
	private int salary;

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	public int getSalary(){
		return salary;
	}	
}
class PojoEmp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[3];
		
		
			System.out.println("Enter id name salary");
			
			emp[0].setId(1);
			emp[0].setName("hii");
			emp[0].setSalary(78700);
		emp[1].setId(2);
		emp[1].setName("good");
		emp[1].setSalary(4530);
		emp[2].setId(3);
		emp[2].setName("bye");
		emp[2].setSalary(9809);
		System.out.println("Retrieve data from object ");
		
		System.out.println(emp[0].getId()+" "+emp[0].getName()+" "+emp[0].getSalary());
		
	}
}