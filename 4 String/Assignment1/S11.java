import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        scanner.close();

        int vowelCount = countVowels(name);
        System.out.println("The name contains " + vowelCount + " vowel(s).");
    }

    public static int countVowels(String inputString) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }

        return count;
    }
}
