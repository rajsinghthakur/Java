package patternprinting;

public class P88 {
    public static void main(String args[]) {
        int i, j, k, l, z;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if (i == 5 || i == k) {
                    System.out.print(k);
                } else
                    System.out.print(" ");
            }
            // 2nd loop
            for (k = i - 1; k >= 1; k--) {
                if (i == 5) {
                    System.out.print(k);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (i = 4; i >= 1; i--) {
            for (z = 1; z <= 1; z++) {
                System.out.print(" ");
            }
            for (j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if (j == k - 1) {
                    System.out.print(k);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
