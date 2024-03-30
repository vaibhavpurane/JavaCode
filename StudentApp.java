import java.util.*;

class Student{
	private int a[];
	private double avg;
	private double per;
	private String grade;
int sum=0;

	public void setSubMarks(int s[]){
		a=s;
	}
	public void calculatePer(){
		
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		avg=sum/6;
		per=(double)((sum/6));
	}
	public void checkGrades(){
		if(per>75 && per<=100){
			grade="Distinction";}
		else if(per>60 && per<=75){
			grade="First Division";}
		else if(per>50 && per<=60){
			grade="Second division";}
		else if(per>40 && per<=50){
			grade="Third Division";}
		else{
			grade="Failed";
		}
		System.out.println("Grade is: "+grade);
	}
}
public class StudentApp{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int s[]=new int[6];
		System.out.println("Enter 6 subject marks outof 100\n");
		for(int i=0;i<s.length;i++){
			s[i]=sc.nextInt();
		}
		Student S = new Student();
		S.setSubMarks(s);
		S.calculatePer();
		S.checkGrades();
	}
}
