import java.util.*;

class Vehicle{
     String color = "white";
     String model = "newModel";
     int year = 2024;
 
}
class Car extends Vehicle{
     int numDoors = 4;

     public void display(){
         System.out.println("Color of car "+color);
         System.out.println("Model of car "+model);
         System.out.println("Year of car "+year);
         System.out.println("Doors of car "+numDoors);
     }
}
public class VehicleApp{
     public static void main(String []args){
         Car c = new Car();
         c.display();
     }
}