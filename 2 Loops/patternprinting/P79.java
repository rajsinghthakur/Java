package patternprinting;

public class P79 {
    /*
     * public static void main(String[] args) {
     * int i, j;
     * for (i = 1; i <= 7; i++) {
     * for (j = 1; j <= i; j++) {
     * // if (i == 4 || j == 1 || j == 2 && i <= 6 || j == 3 && i <= 5)
     * if (j == 1 || i == j && i <= 4 || i == 6 && j <= 2 || i == 5 && j == 3)
     * System.out.print(j);
     * else
     * System.out.print(" ");
     * }
     * System.out.println();
     * }
     * }
     */
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == j)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (i = 3; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == j)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
