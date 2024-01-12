// public class B8 {
//     public static void main(String[] args) {

//         String s = "raj thakur";
//         String chek = "3456";
//         char c1[] = s.toCharArray();
//         char c2[] = chek.toCharArray();
//         char c3 = c2[0];
//         System.out.println(c3);
//         boolean contains = false;
//         int i, count = -1;
//         for (i = 0; i < s.length(); i++) {
//             count++;
//             if (c1[i] == c3)
//                 break;
//         }
//         System.out.println(count);
//         String s2 = "";
//         for (int a = count; a < chek.length() + count; a++) {
//             s2 = s2 + c1[a];
//         }
//         for (i = 0; i < s2.length(); i++) {
//             if (s2.charAt(i) == chek.charAt(i))
//                 contains = true;
//         }
//         System.out.println("2" + s2 + "2");
//         System.out.println("2" + chek + "2");

//         if (contains) {
//             System.out.println(true);
//         } else {
//             System.out.println(false);
//         }

//     }
// }
public class B8 {
    public static void main(String[] args) {
        String s = "raj thakur";
        String c = "kur";

        boolean chek = false;

        for (int i = 0; i <= s.length() - c.length(); i++) {
            boolean found = true;

            for (int j = 0; j < c.length(); j++) {
                if (s.charAt(i + j) != c.charAt(j)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                chek = true;
            }
        }

        if (chek) {
            System.out.println("The string contains the specified sequence.");
        } else {
            System.out.println("The string does not contain the specified sequence.");
        }
    }
}
