import java.util.*;
class Per{
	protected float percent;

	public void calPer(int s[]){
		int sum = 0;
		for(int i=0; i<s.length; i++)
			sum = sum + s[i];
		percent = (sum*100/600) ;
	}
}
class CSE extends Per {
	private String name;
	private int id;
	private String address;
	private String Year;
	
	public CSE(String name, int id, String address, String Year){
		this.name = name;
		this.id = id;
		this.address = address;
		this.Year = Year;
	}
	void showCSEPer() {
		System.out.println("Name: "+name);
		System.out.println("id: "+id);
		System.out.println("Address: "+address);
		System.out.println("Year: "+Year);
		System.out.println("Percentage: "+percent);		
	}
}
class ETC extends Per {
	private String name;
	private int id;
	private String address;
	private String Year;
	
	public ETC(String name, int id, String address, String Year){
		this.name = name;
		this.id = id;
		this.address = address;
		this.Year = Year;
	}
	void showETCPer() {
		System.out.println("Name: "+name);
		System.out.println("id: "+id);
		System.out.println("Address: "+address);
		System.out.println("Year: "+Year);
		System.out.println("Percentage: "+percent);
	}	
}
public class ResultApp{
	public static void main(String x[]){
			
		int arr[] = new int[]{45, 68, 88, 35, 77, 60};
		
		CSE cse = new CSE("Vaibhav", 11, "212-SDF", "2023");
	 	cse.calPer(arr);
		cse.showCSEPer();

		ETC etc = new ETC("GajjuBhai", 22, "7687-HGJ", "2023");
		etc.calPer(arr);
		etc.showETCPer();
	}
}