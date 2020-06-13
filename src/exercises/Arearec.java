package exercises;
import java.util.Scanner;

public class Arearec {
    public static void main(String[] args) {

        double length;
        double width;
        Scanner input1;
        Scanner input2;
        double area;

        input1 = new Scanner(System.in);
        input2 = new Scanner(System.in);
        System.out.println("enter the length of rectangle:");
        length = input1.nextDouble();
        System.out.println("Enter width of rectangle:");
        width = input2.nextDouble();
        input1.close();
        input2.close();
        area = length * width;
        System.out.println("The area of rectangle:" + area);

    }

}
