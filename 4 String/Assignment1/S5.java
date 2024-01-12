// public class S5 {
//     public static void main(String[] args) {
//         String a = "Java Is Platform Independent";
//         String r = s(a);
//         System.out.println("Input: \"" + a + "\"");
//         System.out.println("Output: \"" + r + "\"");
//     }

//      static String s(String input) {
//         String w[] = input.split("\\s+");
//         StringBuilder rv = new StringBuilder();

//         for (String i : w) {
//             StringBuilder rw = new StringBuilder(i);
//             rw.reverse();
//             rv.append(rw).append(" ");
//         }

//         return rv.toString().trim();
//     }
// }
class main {
    public static void main(String[] args) {
        String s = "java is a simple languge";
        String a[] = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            String reverse = " ";
            for (int j = 0; j < a[i].length(); j++) {
                char ch = a[i].charAt(j);
                reverse = ch + reverse;
            }
            System.out.print(reverse);
        }
    }
}
