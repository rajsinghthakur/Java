import java.util.ArrayList;
import java.util.List;

public class S6 {
    public static void main(String[] args) {
        String input = "aaabbbacccababacccaabb";
        List<String> palindromes = findAllPalindromes(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("All possible palindromes:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }
    }

    public static List<String> findAllPalindromes(String input) {
        List<String> palindromes = new ArrayList<>();

        int n = input.length();
        for (int center = 0; center < 2 * n - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (left >= 0 && right < n && input.charAt(left) == input.charAt(right)) {
                String palindrome = input.substring(left, right + 1);
                palindromes.add(palindrome);
                left--;
                right++;
            }
        }

        return palindromes;
    }
}
