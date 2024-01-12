package patternprinting;

public class P61 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i+=2) {
            for (int k = 8; k >= i; k-=2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
