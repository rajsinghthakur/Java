package patternprinting;

public class P82 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 7; i += 2) {
            for (int k = 5; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
        for (i = 1; i <= 7; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                System.out.print(" ");
            }
            for (j = 5; j >= i; j--) {
                if (j == 5 || j == i)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }
}
/*package patternprinting;

public class P83 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 7; i++) {
            for (j = 1; j <= 7; j++) {
                if (i == 1 && j <= 4 || i == 1 && j >= 4 || i == 2 && j <= 3 || i == 2 && j >= 5 || i == 3 && j <= 2
                        || i == 3 && j >= 6 || i == 4 && j <= 1 || i == 4 && j >= 7 || i == 5 && j <= 2
                        || i == 5 && j >= 6 || i == 6 && j <= 3 || i == 6 && j >= 5 || i == 7 && j <= 4
                        || i == 7 && j >= 4) {
                    if (i == 1 && j == 4 || i == 1 && j == 4 || i == 2 && j == 3 || i == 2 && j == 5 || i == 3 && j == 2
                            || i == 3 && j == 6 || i == 4 && j == 1 || i == 4 && j == 7 || i == 5 && j == 2
                            || i == 5 && j == 6 || i == 6 && j == 3 || i == 6 && j == 5 || i == 7 && j == 4
                            || i == 7 && j == 4)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else
                    System.out.print("_");
            }
            System.out.println();
        }

    }
}
 */