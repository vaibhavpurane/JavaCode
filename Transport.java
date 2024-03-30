import java.util.*;
class Vehicle {
	protected String v_model;
	protected String reg_no;
	protected int v_speed;
	protected int f_capacity;
	protected int f_consumption;
	protected int f_need;
	protected int dist_cov;

	public Vehicle(String v_model, String reg_no,int v_speed,int f_capacity, int f_consumption){
		this.v_model=v_model;
		this.reg_no=reg_no;
		this.v_speed=v_speed;
		this.f_capacity=f_capacity;
		this.f_consumption=f_consumption;
	}
	public int fuelNeeded(int dist){
		f_need = dist/f_consumption;
		return f_need;
	}
	public int dist_covered(int time){
		dist_cov = v_speed*time;
		return dist_cov;
	}
	public void display(){
		System.out.println("Vehicle model : "+v_model);
		System.out.println("Vehicle register no : "+reg_no);
		System.out.println("Vehicle speed : "+v_speed);
		System.out.println("fuel capacity : "+f_capacity);
		System.out.println("fuel consumption : "+f_consumption);
		System.out.println("fuel needed : "+f_need);
		System.out.println("Distance covered : "+dist_cov);
	}	
};

class Truck extends Vehicle{
	private int weightlimit;

	public Truck(String v_model, String reg_no,int v_speed,int f_capacity, int f_consumption,int weightlimit){
		super(v_model, reg_no, v_speed, f_capacity, f_consumption);
		this.weightlimit=weightlimit ;
	}
	public void display(){
		System.out.println("Vehicle model : "+v_model);
		System.out.println("Vehicle register no : "+reg_no);
		System.out.println("Vehicle speed : "+v_speed);
		System.out.println("fuel capacity : "+f_capacity);
		System.out.println("fuel consumption : "+f_consumption);
		System.out.println("fuel needed : "+f_need);
		System.out.println("Distance covered : "+dist_cov);
		System.out.println("Cargo weight limit :"+weightlimit); 
	}

};

class Bus extends Vehicle{
	private int noOfPassenger;

	public Bus(String v_model, String reg_no,int v_speed,int f_capacity, int f_consumption,int noOfPassenger){
		super(v_model, reg_no, v_speed, f_capacity, f_consumption);
		this.noOfPassenger=noOfPassenger ;
	}
	public void display(){
		System.out.println("Vehicle model : "+v_model);
		System.out.println("Vehicle register no : "+reg_no);
		System.out.println("Vehicle speed : "+v_speed);
		System.out.println("fuel capacity : "+f_capacity);
		System.out.println("fuel consumption : "+f_consumption);
		System.out.println("fuel needed : "+f_need);
		System.out.println("Distance covered : "+dist_cov);
		System.out.println("No of Passengers :"+noOfPassenger); 
	}
};

public class Transport{
	public static void main(String []x){
		
		Truck T = new Truck("TATA", "MH 14 1999", 100, 20, 10, 500);
		T.fuelNeeded(100);
		T.dist_covered(4);
		T.display();	
		
		Bus B = new Bus("TATA", "MH 14 1999", 100, 20, 10, 500);
		B.fuelNeeded(100);
		B.dist_covered(4);
		B.display();
	}
}