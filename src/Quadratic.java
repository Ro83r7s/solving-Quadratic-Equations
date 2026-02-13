import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        // Small test 1: Design a flowchart
        //Solving Quadratic Equations
        //Standard Form: ax2 + bx + c = 0.

        // Creating a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declaring variables
        double a;
        double b;
        double c;

        // Input for the first value
        System.out.print("input a: ");
        a = input.nextDouble();

        // A quadratic equation must have a non-zero 'a' value
        if (a == 0) {
            System.out.println("Not quadratic equation!");
        }
        else
        {
            // Input for remaining values if 'a' is valid
            System.out.print("input b: ");
            b = input.nextDouble();
            System.out.print("input c: ");
            c = input.nextDouble();

            // Calculate the discriminant
            double D = (b * b) - (4 * a * c);

            // Determine the roots based on the Discriminant
            if (D == 0) {

                // If D is 0, there is exactly one real root (or two identical ones)
                System.out.println("Two equal roots.");

            } else if (D > 0) {
                // If D is positive, calculate two distinct real roots using the quadratic formula
                double x1;
                double x2;
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Two different roots x1=" + x1 + " and x2=" + x2);

            } else {
                // If D is negative, there aren't real roots.
                System.out.println("No real roots.");
            }
        }
        // Closing the scanner
        input.close();
    }
}