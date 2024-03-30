import java.util.*;

class NumericStrTOValue{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numeric string ");
        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        System.out.println(i);



       String a = Integer.toString(i);
        System.out.println(a);     

    }
}