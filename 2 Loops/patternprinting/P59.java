package patternprinting;

public class P59 {
    public static void main(String[] args) {
        char i, j, k;
        for (i = 65; i <= 69; i++) {
            for (k = 68; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 65; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
