import java.util.*;

class Employee{
	int id;
	String name;
	int salary;

	void setid(int id){
		this.id=id;
	}
	int getId(){
		return id;
	}
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
	void setSalary(int salary){
		this.salary=salary;
	}
	int getSalary(){
		return salary;
	}	
}
class PojoEmp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[3];
		
		for(int i=0;i<3;i++){
			System.out.println("Enter id name salary");
			int id = sc.nextInt();
			String name = sc.nextLine();
			int salary = sc.nextInt();

			emp[i].setId(id);
			emp[i].setNAme(name);
			emp[i].setSalary(salary);
		}
		System.out.println("Retrieve data from object ");
		for(int i=0;i<3;i++){
			System.out.println(emp[i].getId()+" "+emp[i].getName()+" "+emp[i].getSalary());
		}
	}
}