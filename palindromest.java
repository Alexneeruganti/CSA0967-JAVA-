import java.util.Scanner;

public class palindromest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter string:");
        String a = reader.nextLine();
        reader.close();
int i=0;
int m=a.length();
        String b = "";
        while(i!=m) {
            b = a.charAt(i)+b;
i++;
        }

        if (a.equals(b)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
