package patternprinting;

public class P63 {
    public static void main(String[] args) {
        char i, j;
        for (i = 65; i <= 74; i += 2) {
            for (int k = 73; k >= i; k-=2) {
                System.out.print(" ");
            }
            for (j = 65; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
