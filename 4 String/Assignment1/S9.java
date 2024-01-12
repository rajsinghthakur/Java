// public class S9 {
//     public static void main(String[] args) {
//         String inputString = "Dear Student, You have need to work hard";
//         String maxWord = findMaxLengthWord(inputString);
//         System.out.println("Output: \"" + maxWord + "\"");
//     }

//     public static String findMaxLengthWord(String inputString) {
//         String[] words = inputString.split("\\s+");
//         String maxWord = "";

//         for (String word : words) {
//             // Remove punctuation marks from the word
//             word = word.replaceAll("[^a-zA-Z]", "");

//             if (word.length() > maxWord.length()) {
//                 maxWord = word;
//             }
//         }

//         return maxWord;
//     }
// }
class S9 {
    public static void main(String[] args) {
        String s = "java is a simple languge";
        String a[] = s.split(" ");
        int n = a.length;
        int index = 0, max = 0;
        for (int i = 0; i < a.length; i++) {
            int count = a[i].length();
            if (max < count) {
                max = count;
                index = i;
            }
        }
        System.out.println("''" + a[index] + "''" + "is a maximum length of string");
    }
}