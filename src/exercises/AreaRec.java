package exercises;
import java.util.Scanner;

public class AreaRec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the length of the rectangle");
        int RecLength = input.nextInt();
        System.out.println("what is the width of the rectangle");
        int RecWidth = input.nextInt();
        int RecArea = RecLength*RecWidth;
        System.out.println(" the area of the Rectangle is "+RecArea);
    }
}