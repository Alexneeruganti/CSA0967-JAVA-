import java.util.Scanner;

class calculator {
public int calculateSum(int n) {
int sum = 0;
for (int i = 1; i <= n; i++) {
sum += i; }
 return sum;}
}
public class  sumnumbers {
  public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 calculator calculator = new calculator();
 System.out.print("Enter the number of elements: ");
int n = scanner.nextInt();
 int sum = calculator.calculateSum(n);
System.out.println("The sum of first " + n + " numbers is: " + sum);
      
    }
}
