package patternprinting;

public class P84 {
    /*
     * public static void main(String[] args) {
     * int i, j, s;
     * for (i = 1; i <= 5; i++) {
     * for (j = 1, s = i; j <= 9; j++) {
     * if (j >= 6 - i && j <= 4 + i) {
     * s = (s == 0) ? 2 : 5;
     * if (j <= 5)
     * System.out.print(s--);
     * else
     * System.out.print(s++);
     * } else
     * System.out.print(" ");
     * }
     * System.out.println();
     * }
     * }
     */
    public static void printPattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int n = 5;
        printPattern(n);
    }

}
