package exercises.chap2;
import java.util.Scanner;

public class RectArea {
    public static void main(String[] args){
        Scanner height = new Scanner(System.in);
        Scanner width = new Scanner(System.in);

        System.out.println("Calcualte the area of your rectangle");
        System.out.println("Enter the height: ");
        Integer rectHeight = height.nextInt();
        System.out.println("Enter the width: ");
        Integer rectWidth = width.nextInt();

        Integer area = rectHeight * rectWidth;
        System.out.println("The area of your rectangle is: " + area);

    }
}
