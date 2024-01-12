// import java.util.Arrays;

// public class B49 {
//     public static void main(String[] args) {
//         String str1 = "listen";
//         String str2 = "siltne";

//         boolean check = false;

//         if (str1.length() != str2.length()) {
//             check = false;
//         }

//         char[] arr1 = str1.toCharArray();
//         char[] arr2 = str2.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         System.out.println(arr1);
//         System.out.println(arr2);
//         // Compare sorted arrays
//         check = Arrays.equals(arr1, arr2);

//         if (check) {
//             System.out.println(true);
//         } else {
//             System.out.println(false);
//         }
//     }
// }

class B49 {
    public static void main(String[] args) {
        String s1 = "arora";
        String s2 = "arora";
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        int i, j;
        char temp = 0;
        String chek1 = "", chek2 = "";
        for (i = 0; i < c1.length; i++) {
            for (j = i + 1; j < c1.length; j++) {
                if (c1[i] > c1[j]) {
                    temp = c1[i];
                    c1[i] = c1[j];
                    c1[j] = temp;
                }
            }
            chek1 = chek1 + c1[i];
        }
        for (i = 0; i < c2.length; i++) {
            for (j = i + 1; j < c2.length; j++) {
                if (c2[i] > c2[j]) {
                    temp = c2[i];
                    c2[i] = c2[j];
                    c2[j] = temp;
                }
            }
            chek2 = chek2 + c2[i];
        }
        if (chek1.equals(chek2)) {
            System.out.println("the given string is Angram : " + true);
        } else {
            System.out.println("the given string is Angram : " + false);
        }
    }
}