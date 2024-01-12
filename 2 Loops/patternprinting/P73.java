package patternprinting;

public class P73 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 5; i >= 1; i -= 1) {
            for (k = 4; k >= i; k -= 1) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
