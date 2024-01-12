package patternprinting;

public class P70 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i-=1) {
            for (int k = 4; k >= i; k-=1) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
