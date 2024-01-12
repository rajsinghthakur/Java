package patternprinting;

public class P38 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (i == 5 || j == 1 || i == j)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
