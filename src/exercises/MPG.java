package exercises;
import java.util.Scanner;

public class MPG {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int MilesDriven = input.nextInt();
        System.out.println("how much fuel have you consumed during this period?");
        int FuelUsed = input.nextInt();
        double mgp = MilesDriven/FuelUsed;
        System.out.println(" current MPG is "+ mgp);

    }

}
