// public class S10 {
//     public static void main(String[] args) {
//         String inputString = "Dear Student, You have need to work hard";
//         int count = countWordsWithVowelStart(inputString);
//         System.out.println("Number of words whose first letter is a vowel: " + count);
//     }

//     public static int countWordsWithVowelStart(String inputString) {
//         String[] words = inputString.split("\\s+");
//         int count = 0;
//         for (String word : words) {
//             // Remove punctuation marks from the word
//             word = word.replaceAll("[^a-zA-Z]", "");

//             if (!word.isEmpty() && isVowel(word.charAt(0))) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static boolean isVowel(char ch) {
//         ch = Character.toLowerCase(ch);
//         return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//     }
// }

public class S10 {
    public static void main(String[] args) {
        String inputString = "Dear Student, You have need to work hard";
        String words[] = inputString.split("\\s+");
        int count = 0;
        char c[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i <= words.length; i++) {
            for (int j = 0; j <= words.length; j++) {
                if (words[i] == c[j]) {

                }
            }
        }

        System.out.println("Number of words whose first letter is a vowel: " + count);
    }
}