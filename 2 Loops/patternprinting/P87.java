package patternprinting;

public class P87 {
    public static void main(String[] args) {
        int i, j;
        /*
         * / for (i = 1; i <= 10; i++) {
         * for (j = 1; j <= 10; j++) {
         * if (i == 1 || i == 10 || j == 1 || j == 10 || i == 2 && j <= 4 || j == 2 && i
         * <= 4 || i == 9 && j <= 4
         * || j == 9 && i <= 4 || i == 8 && j <= 3 || i == 7 && j <= 2 || i == 6 && j <=
         * 1
         * || i == 3 && j <= 3 || j == 8 && i <= 3 || j == 7 && i <= 2 || i == 9 && j ==
         * 7
         * || i == 9 && j == 8 || i == 9 && j == 9 || i == 8 && j == 8 || i == 8 && j ==
         * 9
         * || i == 7 && j == 9)
         * System.out.print("*");
         * else
         * System.out.print(" ");
         * }
         * System.out.println();
         * }
         */
        for (i = 1; i <= 5; i++) {
            for (int s = 5; s >= i; s--) {
                System.out.print("*");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
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
