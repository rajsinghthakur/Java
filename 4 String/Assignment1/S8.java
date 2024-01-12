// import java.util.HashMap;
// import java.util.Map;

// public class S8 {
//     public static void main(String[] args) {
//         String inputString = "aabbccddd";
//         Map<Character, Integer> occurrences = countOccurrences(inputString);
//         printOccurrences(occurrences);
//     }

//     public static Map<Character, Integer> countOccurrences(String inputString) {
//         Map<Character, Integer> occurrences = new HashMap<>();
//         for (char letter : inputString.toCharArray()) {
//             occurrences.put(letter, occurrences.getOrDefault(letter, 0) + 1);
//         }
//         return occurrences;
//     }

//     public static void printOccurrences(Map<Character, Integer> occurrences) {
//         for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
//             System.out.println(entry.getKey() + "- " + entry.getValue() + " times");
//         }
//     }
// }
public class S8 {
    public static void main(String[] args) {
        String s = "aaabbbcccddd";
        char c[] = s.toCharArray();
        int i, count = 0;
        for (i = 0; i < c.length - 1; i = 0 + temp) {
            int temp = 0;
            count = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    count++;
                    temp++;
                }
            }
            System.out.println(c[i] + " - " + count + " times");
        }
    }

}