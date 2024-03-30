
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
        int no,no1,last,first=0,result=0,mid=0;
        int count=1;
        no=sc.nextInt();
        last=no%10;
        no=no/10;
        no1=no;
        while(no1!=0){
            first=no1;
            no1/=10;
            count*=10;
            
        }
        mid=no%(count/10);
        // result= (last*count)+mid*(count/10)+first;
        System.out.println("cfgvhbj"+last+mid+first);
        // System.out.println("Swap is "+result);
        // System.out.println("ef"+mid);
    }
}

