import java.util.*;
class Interest {
	protected int pamt;
	protected int irate;
	protected int dur;
	
	public void setPRD(int pamt, int irate, int dur){
		this.pamt=pamt;
		this.irate=irate;
		this.dur=dur;
	}
}
class CalculateInterest extends Interest{
	void callInterest(){
		System.out.println("Interest is :"+(pamt*irate*dur)/100);
	}
}
public class InterestApp{
	public static void main(String []x){
		CalculateInterest C = new CalculateInterest();
		C.setPRD(1000, 10, 5);
		C.callInterest();
	}
}