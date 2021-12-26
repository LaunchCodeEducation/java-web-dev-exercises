package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String arg[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles travelled : ");
        double miles = scan.nextDouble();
        System.out.println("Enter gallons : ");
        double gallons= scan.nextDouble();
        double mpg=miles/gallons;
        System.out.println("miles per gallons = "+mpg);
    }
}
