import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

   
    private static void getPasswordCriteria(Scanner scanner, StringBuilder password, List<Character> charPool) {
        System.out.println("Enter the string you want to include in the password:");
        String inputString = scanner.nextLine();
        password.append(inputString);
        
        System.out.println("Enter the number of terms in the password:");
        int terms = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Should the password include numbers? (yes/no)");
        String includeNumbers = scanner.nextLine();

        System.out.println("Should the password include alphabets? (yes/no)");
        String includeAlphabets = scanner.nextLine();

        System.out.println("Should the password include special characters? (yes/no)");
        String includeSpecialChars = scanner.nextLine();

        if (includeNumbers.equalsIgnoreCase("yes")) {
            for (char i = '0'; i <= '9'; i++) {
                charPool.add(i);
            }
        }
        if (includeAlphabets.equalsIgnoreCase("yes")) {
            for (char i = 'a'; i <= 'z'; i++) {
                charPool.add(i);
            }
            for (char i = 'A'; i <= 'Z'; i++) {
                charPool.add(i);
            }
        }
        if (includeSpecialChars.equalsIgnoreCase("yes")) {
            char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+'};
            for (char specialChar : specialChars) {
                charPool.add(specialChar);
            }
        }
        
        generatePassword(password, charPool, terms - inputString.length());
    }

   
    private static void generatePassword(StringBuilder password, List<Character> charPool, int remainingLength) {
        Random random = new Random();
        for (int i = 0; i < remainingLength; i++) {
            password.append(charPool.get(random.nextInt(charPool.size())));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder password = new StringBuilder();
        List<Character> charPool = new ArrayList<>();

        getPasswordCriteria(scanner, password, charPool);
        
        System.out.println("Generated Password: " + password.toString());
    }
}
