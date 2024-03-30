import java.util.*;

//1-----------------------------------------------------------------------
class VoterException extends ArithmeticException{
      public String getVoterError(){
	return "Invalid Voter because below 18";
    }
}
class VotingMachine{
    void verifyVoter(int age){
	if(age<18){
	 VoterException ve = new VoterException();
	   throw ve;
	}
	else{
	  System.out.println("valid voter");
	}
   }
} 
//2----------------------------------------------------------------
class EmployeeException extends ArithmeticException{
      public String getEmployeeError(){
	return "Invalid Employee because below 18 yr experience.";
    }
}
class EmployeeMachine{
    void verifyEmployee(int exp){
	if(exp<18){
	 EmployeeException v2 = new EmployeeException();
	   throw v2;
	}
	else{
	  System.out.println("valid Employee");
	}
   }
} 
//3----------------------------------------------------------------------
class OddNoException extends ArithmeticException{
      public String getoddnoError(){
	return "Number is even";
    }
}
class NumberMachine{
    void verifyNumber(int no){
	if(no%2==0){
	 VoterException v3 = new VoterException();
	   throw v3;
	}
	else{
	  System.out.println("Number is odd");
	}
   }
} 
//4---------------------------------------------------------------

class ArrayException extends ArithmeticException{
      public String getduplicateError(){
	return "Duplicate elements in array ";
    }
}
class ArrayMachine{
    void verifyArray(int arr){
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==){
	 VoterException v3 = new VoterException();
	   throw v3;
	}
	else{
	  System.out.println("Number is odd");
	}
   }
} 
//----------------------------------------------------------------
public class UserExceptionApp{  
    public static void main(String x[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter choice:1: To check Voter Eligibility.\t2: Employee Eligibility\t3: If Number is Odd\t4: If Numbers are duplicate in array\t5: If String does not contain Vowels.");
       int ch=sc.nextInt();
       switch(ch){
           case 1:
               	try{
		    System.out.println("Enter age ");
                    int a=sc.nextInt();
                    VotingMachine vm = new VotingMachine();
		    vm.verifyVoter(a);
	        }
        	catch(VoterException ve){
	            System.out.println(ve.getVoterError());
	        }
                break;
           case 2:
               	try{
		    System.out.println("Enter Experience ");
                    int exp=sc.nextInt();
                    EmployeeMachine vc=new EmployeeMachine();
		    vc.verifyEmployee(exp);
	        }
        	catch(EmployeeException v2){
	            System.out.println(v2.getEmployeeError());
	        }
                break;

           case 3:
               	try{
		    System.out.println("Enter Number: ");
                    int no=sc.nextInt();
                    NumberMachine vz=new NumberMachine();
		    vz.verifyNumber(no);
	        }
        	catch(OddNoException v3){
	            System.out.println(v3.getoddnoError());
	        }
                break;

        }


   }
}
