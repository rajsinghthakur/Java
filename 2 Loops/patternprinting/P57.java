package patternprinting;

public class P57 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {

            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
