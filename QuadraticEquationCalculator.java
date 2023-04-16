import java.util.Scanner;

public class QuadraticEquationCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your equation in the form of ax^2 + bx + c = 0");
        
        System.out.print("Write a: ");
        double a = input.nextDouble();
        
        System.out.print("Write b: ");
        double b = input.nextDouble();
        
        System.out.print("Write c: ");
        double c = input.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (a == 0) {
            System.out.println("a cannot be zero!");
        } else if (delta < 0) {
            System.out.println("Roots are not real.");
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("First root is: " + root1);
            System.out.println("Second root is: " + root2);
        }
    }
}
