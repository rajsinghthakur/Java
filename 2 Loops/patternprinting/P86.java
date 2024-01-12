package patternprinting;

public class P86 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= 10; j++) {
                if (i >= j || j >= 11 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    // public static void main(String[] args) {
    // int i, j;

    // for (i = 1; i <= 5; i++) {
    // for (int s = 5; s >= i; s--) {
    // System.out.print("*");
    // }
    // for (j = 1; j <= i; j++) {
    // System.out.print(" ");
    // }
    // for (j = 2; j <= i; j++) {
    // System.out.print(" ");
    // }
    // for (j = 5; j >= i; j--) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // }
}
