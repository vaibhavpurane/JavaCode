import java.util.*;

class Employee{
	private int id;
	private int sal;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getSal() {
		return sal;
	}
	
	
}
class Company
{    Employee employee;
	Company(Employee employee){
		this.employee=employee;
	}
	void show() {
	System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSal());
	}
}
public class CompanyClassApp{
	public static void main(String[] args) {
		Employee emp = new Employee();
		   emp.setId(1);
		   emp.setName("ABC");
		   emp.setSal(1000);
	  Company c = new Company(emp);

	  c.show();
	}
}
