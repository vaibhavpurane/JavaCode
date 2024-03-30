import java.util.*;
class KBC{
	private int qid;
	private String que;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String ans;
	
	public void setqid(int qid){
		this.qid=qid;
	}
	public void setque(String que){
		this.que=que;
	}
	public void setopt1(String opt1){
		this.opt1=opt1;
	}
	public void setopt2(String opt2){
		this.opt2=opt2;
	}
	public void setopt3(String opt3){
		this.opt3=opt3;
	}
	public void setopt4(String opt4){
		this.opt4=opt4;
	}
	public void setans(String ans){
		this.ans=ans;
	}


	public int getqid(){
		return qid;
	}
	public String getque(){
		return que;
	}
	public String getopt1(){
		return opt1;
	}
	public String getopt2(){
		return opt2;
	}
	public String getopt3(){
		return opt3;
	}
	public String getopt4(){
		return opt4;
	}
	public String getans(){
		return ans;
	}
}
public class MCQ{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		
		
		KBC kbc[] = new KBC[5];
		System.out.println("Enter Qid, Que, opt1, opt2, op3, op4, ans\n");
		for(int i=0;i<kbc.length;i++){
			int qid=sc.nextInt();
			sc.nextLine();
			String que=sc.nextLine();
			String opt1=sc.nextLine();
			String opt2=sc.nextLine();
			String opt3=sc.nextLine();
			String opt4=sc.nextLine();
			String ans=sc.nextLine();

			kbc[i]=new KBC();

			kbc[i].setqid(qid);
			kbc[i].setque(que);
			kbc[i].setopt1(opt1);
			kbc[i].setopt2(opt2);
			kbc[i].setopt3(opt3);
			kbc[i].setopt4(opt4);
			kbc[i].setans(ans);

		}
		System.out.println("Lets try \n");
		
		for(int i=0;i<kbc.length;i++){
			System.out.println(kbc[i].getqid());
			System.out.println(kbc[i].getque());
			System.out.println(kbc[i].getopt1());
			System.out.println(kbc[i].getopt2());
			System.out.println(kbc[i].getopt3());
			System.out.println(kbc[i].getopt4());
			System.out.println("Enter your answer");
			String u_ans = sc.nextLine();
			if(u_ans.equals(kbc[i].getans())){
				count++;
				System.out.println("Correct answer.");
			}
			else{
				System.out.println("Wrong answer\n");
				System.out.println("Correct ans is "+kbc[i].getans());
			}	
		}
		System.out.println("\n..................................\n");
		if(count==1){
			System.out.println("You won the prize amount 1000\n");
		}
		else if(count==2){
			System.out.println("You won the prize amount 2000\n");
		}
		else if(count==3){
			System.out.println("You won the prize amount 5000\n");
		}
		else if(count==4){
			System.out.println("You won the prize amount 10,000\n");
		}
		else if(count==5){
			System.out.println("You won the prize amount 20000\n");
		}
		else{
			System.out.println("Better Luck Next Time");
		}
	
	}
}
