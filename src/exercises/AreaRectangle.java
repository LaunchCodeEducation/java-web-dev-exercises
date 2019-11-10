package exercises;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the width of the rectangle?");
        float width = input.nextFloat();
        System.out.println("What is the length of the rectangle?");
        float length = input.nextFloat();
        float areaOfRectangle = width * length;
        String printStatement = "The area of the rectangle equals " + areaOfRectangle;
        System.out.println(printStatement);
    }
}
