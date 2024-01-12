package patternprinting;

public class P98 {
    public static void main(String[] args) {
        // System.out.println("\n\n\n");
        int i, j;
        for (i = 1; i <= 10; i++) {
            // print R
            for (j = 1; j <= 7; j++) {
                if (j == 1 || i == j + 4 || i == 1 && j <= 4 || i == 6 && j <= 4 || i == 2 && j == 5 || i == 5 && j == 5
                        || i == 3 && j == 6 || i == 4 && j == 6)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // print A
            for (int k = 9; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == 6 || i == j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // print J
            for (int k = 12; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 10; j++) {
                if (i == 1 || j == 6 && i <= 9 || i == 10 && j <= 6 || j == 1 && i >= 6)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // print T
            for (int k = 2; k >= 1; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 9; j++) {
                if (i == 1 || j == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // print H
            for (int k = 2; k >= 1; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 6; j++) {
                if (j == 1 || j == 6 || i == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // print A
            for (int k = 11; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == 6 || i == j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // print K
            for (int k = 11; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 6; j++) {
                if (j == 1 || i == j + 4 || i + j == 7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // print U
            for (int k = 2; k >= 1; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == 10)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // print R
            for (int k = 2; k >= 1; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 7; j++) {
                if (j == 1 || i == j + 4 || i == 1 && j <= 4 || i == 6 && j <= 4 || i == 2 && j == 5 || i == 5 && j == 5
                        || i == 3 && j == 6 || i == 4 && j == 6)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        // System.out.println("\n\n\n");
    }
}