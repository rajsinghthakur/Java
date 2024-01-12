package patternprinting;

public class P16 {
    public static void main(String[] args) {
        int i, j;
        char a = 'a';
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
