package patternprinting;

public class P80 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 7; i += 2) {
            for (int k = 5; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= 6; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                System.out.print(" ");
            }
            for (j = 5; j >= i; j--) {
                if (j % 2 == 0)
                    System.out.print("_");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
