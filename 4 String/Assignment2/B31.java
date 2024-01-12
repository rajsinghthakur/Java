
// public class B31 {
//     public static void main(String[] args) {
//         String s = "aabbddees";
//         char c[] = s.toCharArray();
//         boolean chek = true;
//         for (int i = 0; i < c.length; i++) {
//             int count = 0;
//             for (int j = 0; j < c.length; j++) {
//                 if (c[i] == c[j]) {
//                     count++;
//                 }
//             }
//             if (count == 1) {
//                 chek = false;
//                 System.out.println(c[i] + " : is first non repeating character");
//                 break;
//             }
//         }
//         if (chek) {
//             System.out.println("non repeating character is not aveleble");
//         }
//     }
// }
import java.util.Scanner;

public class B31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int i;
        boolean result = false;
        for (i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count == 1) {
                result = true;
                System.out.println("First non repeating element  : " + ch[i]);
                break;
            }
        }
        if (!result) {
            System.out.println("Not Available");
        }
    }
}