package patternprinting;

public class P97 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 11; i++) {
            for (j = 1; j <= 20; j++) {
                if (i == 1 && j <= 8 || i == 11 && j <= 8 || i == 6 && j <= 12 || j == 8 || j == 12 && i >= 6
                        || i == 11 && j >= 12 || j == 20 && i >= 6 || i == 7 && j == 15 || i == 8 && j == 15
                        || i == 7 && j == 16 || i == 8 && j == 16 || i == 7 && j == 17 || i == 8 && j == 17)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

    }
}
