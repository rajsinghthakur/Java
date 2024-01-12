import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter a string");
        String s1 = "welcome to java";
        String s2[] = s1.split(" ");
        String word = "";
        for (int i = 0; i < s2.length; i++) {
            word = s2[i];
            char c1[] = word.toCharArray();
            if (c1[0] >= 'a' && c1[0] <= 'z') {
                c1[0] = ((char) (c1[0] - 32));
            }
            for (int j = 0; j < c1.length; j++) {
                System.out.print(c1[j]);
            }
            System.out.print(" ");
        }

    }
}
