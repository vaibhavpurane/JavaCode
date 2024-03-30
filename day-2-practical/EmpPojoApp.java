import java.util.*;

class Employee{
    int id;
    String name;
    String designation;
    int salary;
    
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
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public String getDesignation(){
        return designation;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    } 
}
class Company{
    Employee emp[];
    Company(Employee ...emp){
        this.emp=emp;
    }
    public void sortEmployee(){
        System.out.println("Sorting");
        for(int i=0; i<emp.length;i++){
             for(int j=0; j<emp.length;j++){
                 if(emp[i].getId()>emp[j].getId()){
                     Employee temp = emp[i];
                     emp[i]=emp[j];
                     emp[j]=temp;
                  }
             }
        }
    }
    public void show(){
        for(int i=0; i<emp.length;i++){
             System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getDesignation()+"\t"+emp[i].getSalary());
        
         }
    } 
}
public class EmpPojoApp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of employees ");
        int s = sc.nextInt();

      
        Employee emp[] = new Employee[s];
        System.out.println("Enter id, name, designation, salary of Employee:\n ");
        for(int i=0; i<s; i++){
            int id = sc.nextInt();
            String name = sc.next();
            String designation = sc.next();
            int salary = sc.nextInt();
            
            emp[i] = new Employee();
            emp[i].setId(id);
            emp[i].setName(name);
            emp[i].setDesignation(designation);
            emp[i].setSalary(salary);
          
            System.out.println();
        }
        Company c = new Company(emp);
        c.show();
        c.sortEmployee();
        c.show();  
    }
}








