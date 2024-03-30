import java.util.*;

class Rectangle{
    public int length;
    public int breadth;

    Rectangle(){
        length=0;
        breadth=0;
    }
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle(int num){
        length=num;
        breadth=num;
    }

    public void area(){
        System.out.println("Area is "+ length*breadth);
    }
}
public class RactangleApp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        r.area();
        Rectangle r1 = new Rectangle(4,6);
        r1.area();
        Rectangle r2 = new Rectangle(9);
        r2.area();
    }
} 