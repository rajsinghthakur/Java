// import java.util.LinkedHashSet;

// public class S7 {
//     public static void main(String[] args) {
//         String input = "aabbccddd";
//         String result = removeDuplicates(input);
//         System.out.println("Input: \"" + input + "\"");
//         System.out.println("Output: \"" + result + "\"");
//     }

//     public static String removeDuplicates(String input) {
//         // Use LinkedHashSet to preserve the order of appearance
//         LinkedHashSet<Character> uniqueCharacters = new LinkedHashSet<>();

//         for (char c : input.toCharArray()) {
//             uniqueCharacters.add(c);
//         }

//         StringBuilder resultBuilder = new StringBuilder();
//         for (char c : uniqueCharacters) {
//             resultBuilder.append(c);
//         }

//         return resultBuilder.toString();
//     }
// }
public class S7 { 
    public static void main(String[] args) {
        String s = "aaabbbcccddd";
        char c[] = s.toCharArray();
        int i, j;
        String ans = "";
        for (i = 0; i < c.length - 1; i++) {
            for (j = 0; j < c.length; j++) {
                if (c[i] == c[j]) {
                    break;
                }
            }
            if (i == j) {
                ans = ans + c[i];
            }
        }
        System.out.println("output : " + ans);
    }

}
