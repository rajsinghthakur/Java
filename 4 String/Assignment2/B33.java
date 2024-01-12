import java.util.HashMap;
import java.util.Map;

public class B33 {
    public static void main(String[] args) {
        String str = "hooello world";
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        char maxChar = '\0';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        System.out.println("Maximum occurring of character: " + maxChar);
    }
}
