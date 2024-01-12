package patternprinting;

public class P21 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == 5 || i == j)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
