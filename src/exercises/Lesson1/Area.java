package exercises.Lesson1;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rectangle length in sq ft: ");
        Double length = input.nextDouble();
        System.out.println("Enter rectangle width in sq ft: ");
        Double width = input.nextDouble();
        Double area = length * width;
        System.out.println("Your rectangle's area is: " + area + " sq ft");
    }
}
