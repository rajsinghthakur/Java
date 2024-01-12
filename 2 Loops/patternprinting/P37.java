package patternprinting;

public class P37 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                if (i == 5 || i == 3 || i == 1)
                    System.out.print("*");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}
