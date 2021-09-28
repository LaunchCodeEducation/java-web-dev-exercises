package exercises.Lesson1;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        Double milesDriven = input.nextDouble();

        System.out.println("Enter the amount of gas consumed (in gallons): ");
        Double gasConsumed = input.nextDouble();

        Double milesPerGallon = milesDriven/gasConsumed;
        System.out.println("You are running on " + milesPerGallon + " mpg.");

    }
}
