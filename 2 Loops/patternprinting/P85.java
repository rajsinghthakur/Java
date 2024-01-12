package patternprinting;

public class P85 {
    /*
     * public static void main(String[] args) {
     * int i, j;
     * for (i = 1; i <= 5; i++) {
     * for (j = 1; j <= 10; j++) {
     * if (i == 5 || j == 1 | j == 10 || i == 2 && j <= 2 || i == 3 && j <= 3 || i
     * == 4 && j <= 4
     * || j == 9 && i >= 2 || j == 8 && i >= 3 || j == 7 && i >= 4)
     * System.out.print("*");
     * else
     * System.out.print(" ");
     * }
     * System.out.println();
     * }
     * 
     * }
     */

    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 5; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            for (j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
