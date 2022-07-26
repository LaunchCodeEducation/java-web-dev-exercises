package studios.Car;

//import java.util.HashMap;

public class Car {
    int milage;
//    HashMap

    public Car(int milage){
        this.milage = milage;
    }

    public void getMileage(){
        System.out.println(this.milage);
    }

    public static void move(){
        System.out.println("Moving..");
    }
}
