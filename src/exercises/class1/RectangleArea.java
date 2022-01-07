package exercises.class1;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle height?");
        int rectangleHeight = input.nextInt();

        System.out.println("Rectangle width?");
        int rectangleWidth = input.nextInt();

        System.out.println("Area is " + (rectangleWidth * rectangleHeight));
    }
}
