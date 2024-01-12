package patternprinting;

public class P90 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                if (j == i || j == 11 - i)
                    // (i == j || i == 7 && j == 1 || i == 6 && j == 2 || i == 5 && j == 3 || i == 1
                    // && j == 7 || i == 2 && j == 6 || i == 3 && j == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
