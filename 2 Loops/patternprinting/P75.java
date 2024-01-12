package patternprinting;

public class P75 {
    public static void main(String[] args) {
        int i, j;
        for (i = 9; i >= 1; i -= 2) {
            for (int k = 8; k >= i; k-=2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (i == 9 || j == 1 || j == i)
                    System.out.print(j);
                else
                    System.out.print("+");
            }
            System.out.println();
        }
    }
}
