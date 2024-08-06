import java.util.Scanner;

class ArrayOperations {
    private int[] arr;
    private int size;

    public ArrayOperations(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public void displayArray() {
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sortIncreasing() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void sortDecreasing() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public boolean binarySearch(int key) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return true;
            }
            if (arr[mid] < key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}

public class menuprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        ArrayOperations operations = new ArrayOperations(size);
        operations.inputArray();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Sort in Increasing Order");
            System.out.println("2. Sort in Decreasing Order");
            System.out.println("3. Binary Search");
            System.out.println("4. Display Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operations.sortIncreasing();
                    System.out.println("Array sorted in increasing order.");
                    break;
                case 2:
                    operations.sortDecreasing();
                    System.out.println("Array sorted in decreasing order.");
                    break;
                case 3:
                    System.out.print("Enter the element to search: ");
                    int key = scanner.nextInt();
                    boolean found = operations.binarySearch(key);
                    if (found) {
                        System.out.println("Element found in the array.");
                    } else {
                        System.out.println("Element not found in the array.");
                    }
                    break;
                case 4:
                    operations.displayArray();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
