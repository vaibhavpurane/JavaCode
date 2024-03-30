import java.util.*;
public class Arithoper{
    public static void main(String args[]){
        System.out.println("Arithmatic Operations\n");
        Scanner sc = new Scanner(System.in);
        int choice,first,second,result=0;
        String s;
        do{
            System.out.println("Which operation you want to perform\n 1 Add\n2 Sub\n3 Mul\n4 Div\n");
            choice=sc.nextInt();
            System.out.println("Enter two numbers\n");
            first=sc.nextInt();
            second=sc.nextInt();
            switch(choice){
                case 1:
                    result=first+second;
                    break;
                case 2:
                    result=first-second;
                    break;
                case 3:
                    result=first*second;
                    break;
                case 4:
                    result=first/second;
                    break;
            }
         System.out.println("Result is "+result+"\nDo you want to continue ");
         s=sc.nextLine();
         }
         while(!(s.equals('Y'))||!(s.equals('y')));
    }    
}


