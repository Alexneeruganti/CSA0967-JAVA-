import java.util.Scanner;
public class quadratic {
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
System.out.println("Coefficient of x^2:");
        int a = reader.nextInt();
System.out.println("Coefficient of x:");
        int b = reader.nextInt();
 System.out.println("Constant number:");
        int c = reader.nextInt();
        int d = (b * b) - 4 * a * c;
        if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are equal. They are " + root + ", " + root);
        } else if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are distinct. They are " + root1 + ", " + root2);
        } else {
            System.out.println("The roots are imaginary.");
        }
        
    }
}
