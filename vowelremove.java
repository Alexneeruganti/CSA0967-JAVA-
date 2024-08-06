import java.util.Scanner;

public class vowelremove {
    public static void main(String[] args) {
 Scanner reader = new Scanner(System.in);
int i, j;
 System.out.println("enter string:");
  String a = reader.nextLine();
 int m = a.length();
  String b = "AEIOUaeiou";
  int n = b.length();
        String result = "";
 for (i = 0; i < m; i++) {
   boolean isVowel = false;
   for (j = 0; j < n; j++) {
 if (a.charAt(i) == b.charAt(j)) {
     isVowel = true;
 break;
     }
            }
 if (!isVowel) {
      result += a.charAt(i);
            }
 }

 System.out.println("String without vowels: " + result);
    }
}
