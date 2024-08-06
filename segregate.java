import java.util.Scanner;

public class segregate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of the array (0s and 1s only):");
        for (int i = 0; i < size; i++) { 
            a[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            a[i] = 0;
        }
        for (int i = count; i < a.length; i++) {
            a[i] = 1;
        }
        System.out.println("Array after segregation:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}.
