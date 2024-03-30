import java.util.*;

class Employee{
	private String name;
	private int id;
	private int basicSal;
	private int progress;
	private int tSal=0;

	public void setPersonalInfo(String name, int id, int basicSal){
		this.name=name;
		this.id=id;
		this.basicSal=basicSal;
	}
	public void setProgressPer(int progress){
		this.progress=progress;
		if(progress>60){
			tSal=basicSal+(basicSal*30/100);

		}
	}
	public void show(){
		System.out.println("\nName "+name+"\nId "+id+"\nBasic Salary "+basicSal+"\nIncrement Salary "+(basicSal*30/100)+"\nTotal Salary "+tSal);
	}
}
public class EmployeeInfo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String name;
		int id, basicSal, progress;
		System.out.println("Enter name id basicSal and progress of Employee\n");
		name = sc.nextLine();
		id = sc.nextInt();
		basicSal = sc.nextInt();
		progress = sc.nextInt();
		Employee e = new Employee();
		e.setPersonalInfo(name, id, basicSal);
		e.setProgressPer(progress);
		e.show();
	}
}