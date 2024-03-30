import java.util.*;

class AddAmount{
    public int amount = 50;

    AddAmount(){
        amount=50;
    }
    AddAmount(int extra){
        amount=amount+extra;
    }
    public void display(){
        System.out.println("New Amount in Bank is "+amount);
    }
}
public class BankClassApp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to add ");
        int extra = sc.nextInt();

        AddAmount a = new AddAmount(extra);
        a.display();
    }
}
    