/**
 * This program outputs a downwards facing arrow composed of a rectangle and a right triangle.
 * The arrow dimensions are defined by user specified arrow base height, arrow base width, and arrow head width.
 *
 * @author  Nicholas Bolda
 * @version October 4, 2023
 */

import java.util.Scanner;

public class DrawHalfArrow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight;
        int arrowBaseWidth;
        int arrowHeadWidth;

        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();

        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();

        System.out.println("Enter arrow head width:");
        arrowHeadWidth = scnr.nextInt();
        System.out.println("");

        // Continues to prompt user if the arrow base width is larger than the inputted arrow head width.
        while (arrowHeadWidth < arrowBaseWidth) {
            System.out.println("Please enter an arrow head width that is larger than " + arrowBaseWidth + ":");
            arrowHeadWidth = scnr.nextInt();
        }
        System.out.println("");

        // Nested loop that prints the arrow shaft based on the dimensions given by user input.
        for (int height = 0; height < arrowBaseHeight; ++height) {
            for (int width = 0; width < arrowBaseWidth; ++width) {
                System.out.print("*");
            }
            System.out.print('\n');
        }

        // Second nested loop that prints the arrow point based on a base width inputted by the user.
        for (int height = arrowHeadWidth; height > 0; --height) {
            for (int width = arrowHeadWidth; width > 0; --width) {
                System.out.print("*");
            }
            // Loop then removes a star after each iteration to create the point.
            --arrowHeadWidth;
            System.out.print('\n');
        }
    }
}
