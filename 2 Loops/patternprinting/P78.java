package patternprinting;

public class P78 {
    public static void main(String[] args) {
        int i, j, k = 0;
        for (i = 1; i <= 4; i++) {
            for (k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (i = 3; i >= 1; i--) {
            for (k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        /*
         * for (i = 1; i <= 7; i++) {
         * k = i <= 4 ? ++k : --k;
         * int a = 0;
         * for (j = 1; j <= 4; j++) {
         * if (j >= 5 - k)
         * System.out.print(++a);
         * else
         * System.out.print(" ");
         * }
         * System.out.println();
         * }
         */
    }
}
