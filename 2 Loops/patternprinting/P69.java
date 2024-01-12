package patternprinting;

public class P69 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 9; i >= 1; i-=2) {
            for (k = 8; k >= i; k-=2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
