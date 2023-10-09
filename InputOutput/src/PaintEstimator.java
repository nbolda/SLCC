/**
 * This class calculates wall area, paint gallons needed, and cans of paint needed based on user input.
 *
 * @author  Nicholas Bolda
 * @version September 13, 2023
 */

import java.util.Scanner;
import java.lang.Math;

public class PaintEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double gallons;
        final int cans;
        double wallHeight;
        double wallWidth;
        double wallArea;

        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculates and outputs the amount of paint in gallons needed to paint the wall
        gallons = wallArea / 350.0;
        System.out.println("Paint needed: " + gallons + " gallons");

        // Calculates and outputs the number of 1 gallon cans needed to paint the wall, rounded up to the nearest integer
        cans = (int) Math.ceil(gallons / 1);
        System.out.printf("Cans needed: " + cans + " can(s)");
    }
}
