package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        double miles = input.nextDouble();

        System.out.println("Enter gallons used: ");
        double gallons = input.nextDouble();

        double mph = miles / gallons;

        System.out.println("Your MPG is: " + mph );
    }
}
