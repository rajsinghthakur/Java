package patternprinting;

public class P68 {
    public static void main(String[] args) {

        int i, j;
        for (i = 1; i <= 9; i += 2) {
            for (int k = 8; k >= i; k-=2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (i == 9 && j <= 4 || i == 7 && j <= 3 || i == 5 && j <= 2 || i == 3 && j <= 1 || j == 9 || j == 8
                        || j == 7 || j == 6 || j == 5 && i <= 7 || j == 4 && i <= 5 || j == 3 && i <= 3)
                    System.out.print("*");
                else
                    System.out.print("#");
            }
            System.out.println();
        }

    }
}
