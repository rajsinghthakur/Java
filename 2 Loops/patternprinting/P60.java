package patternprinting;

public class P60 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (i == 5 || j == 1 || i == j)
                    System.out.print("x ");
                else
                    System.out.print("_ ");

            }
            System.out.println();
        }
    }
}
