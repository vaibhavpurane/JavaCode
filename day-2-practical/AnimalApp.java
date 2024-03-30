import java.util.*;

class Animal{
    int eat;
    int sleep;
    public void eat(){
        System.out.println("Animal had a dinner");
    }
    public void sleep(){
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal{
    int bark;
    int breed;
    public void bark(){
        System.out.println("Dog is barking.");
    }

}

public class AnimalApp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.bark();
    }
}

