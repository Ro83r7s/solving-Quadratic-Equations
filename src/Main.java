import java.util.InputMismatchException;
import java.util.Scanner; // import Scanner class after creating the Scanner.

public class Main {
    public static void main(String[] args) {
        /*
        Small test 1: Design a flowchart
        Solving Quadratic Equations
        Standard Form: ax^2 + bx + c = 0
        */

        //1) Creating a Scanner, to read the input.
        Scanner scanner = new Scanner(System.in);

        //2) Declaring the variables.
        double a;
        double b;
        double c;

        double eps = 1e-9;  // eps (1e-9) means 1 × 10^-9 = 0.000000001.
        // It is a small tolerance used to check if D is "close enough" to zero
        // because double values may contain tiny rounding errors.


        //3) Reading from input.
        System.out.println("Hello!");
        System.out.println("Please enter the values, to solve the quadratic equation!:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println();

        // starting the while loop until value a != 0
        while (true) {

            //Read a with validation + try/catch
            while (true){
            System.out.print("Enter a: ");
            try {
                a = scanner.nextDouble();
                // if a == 0, then it is not a quadratic equation
                if (Math.abs(a) <= eps) {
                    System.out.println("Please enter a non-zero value for a.");
                    System.out.println();
                    continue;
                }
                break;
            }
            catch (InputMismatchException e) {
            System.out.println("Input error - please enter a NUMBER.");
            scanner.next();
                System.out.println();
                }
            }
            // Read b with try/catch
            while (true){
                System.out.print("Enter b: ");
                try{
                    b = scanner.nextDouble();
                    break;
                }
            catch (InputMismatchException e) {
                System.out.println("Input error - please enter a NUMBER.");
                scanner.next();
                System.out.println();
                }
            }
            // Read c with try/catch
            while (true) {
                System.out.print("Enter c: ");
                try {
                    c = scanner.nextDouble();
                    break;
                }catch (InputMismatchException e) {
                System.out.println("Input error - please enter a NUMBER.");}
                scanner.next();
                System.out.println();
            }
            // 4) Calculate the Discriminant D = b^2 - 4ac.
            double D = (b * b) - (4 * a * c);

            // 5) Check D value and roots
            if (D > eps) {
                // if D > 0, then 2 real roots:
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);

                System.out.println();
                System.out.println("Two different roots:");
                System.out.println("x1 = " + x1 + ", " + " x2 = " + x2);
            } else if (Math.abs(D) <= eps) {
                // If D is approximately 0 , then 1 real root (double root)
                double x = -b / (2 * a);

                System.out.println();
                System.out.println("One root:");
                System.out.println("The equation root is  x = " + x);
            } else {
                // If D < 0 , then no real roots.
                System.out.println();
                System.out.println("No real roots! x ∈ ∅");
            }

            //Adding choice to repeat process if needed.
            System.out.println("Do you want to try again? (y/n): ");
            String choice = scanner.next(); // Reading the input

            // Checking if yes or no, ignoring UPPERCASE or lowercase.
            if (choice.equalsIgnoreCase("n")) { // Check if the user wants to exit (n/N), otherwise continue.
                break; // Exits of the program.
            }
            System.out.println();
            System.out.println();
        }

        scanner.close(); // closing the Scanner
        System.out.println("Thank you for using my program!");

    }
}