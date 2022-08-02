package studios.areaofacircle;

import java.util.Scanner;

public class Area {
//    constuctor(){}

    public static void main(String[] args){
        Scanner rInput = new Scanner(System.in);
        System.out.println("What is the radius?");
        double r = rInput.nextDouble();
        Circle c = new Circle(r);

        double area = c.getArea();
        System.out.println(String.format("The area of a circle of radius %s is: %s", r, area));
    }


}
