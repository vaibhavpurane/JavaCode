import java.util.*;

class Voter{
	private int id;
	private int age;
	private String name;
	
	public void setid(int id){
		this.id = id;
	}
	public int getid(){
		return id;
	}

	public void setname(String name){
		this.name = name;
	}
	public String getname(){
		return name;
	}
	public void setage(int age){
		this.age = age;
	}
	public int getage(){
		return age;
	}
}
class VoterBank{
	Voter v[];
	int count = 0;
	public void acceptVoter(Voter ...v){
		this.v=v;
	}
	public void showVoter(){
		for(int i=0; i<v.length; i++){
			if(v[i].getage()>18){
				++count;
				System.out.println(v[i].getname()+" "+v[i].getid()+" "+v[i].getage());
			}
		}
	}
	public void showFinalCount(){
		System.out.println("Valid count: "+count);
		System.out.println("Invalid count: "+(v.length-count));
	}
}
public class VoterBankApp{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		Voter v1 = new Voter();
		v1.setid(1);
		v1.setname("ABC");
		v1.setage(20);

		Voter v2 = new Voter();
		v2.setid(2);
		v2.setname("PQR");
		v2.setage(10);


		VoterBank vb = new VoterBank();
		vb.acceptVoter(v1,v2);
		vb.showVoter();
		vb.showFinalCount();
	}
}

