
package patternprinting;

public class P92 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                if (i == 1 || i == 9 || j == 1 || j == 9)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

    }
}
