package exercises;

import java.util.Scanner;

public class GasUsed {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive? ");
        Double miles = input.nextDouble();


        Scanner input2 = new Scanner(System.in);
        System.out.println("How many gallons of gas did you use? ");
        Double gallons = input2.nextDouble();
        input.close();

        double gallonsPerMile = miles / gallons;
        System.out.println("You are running on " + gallonsPerMile + " gpm.");


    }

}
