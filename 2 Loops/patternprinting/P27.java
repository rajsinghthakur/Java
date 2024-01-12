package patternprinting;

public class P27 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                if (i == 5 || j == 1 || j == i)
                    System.out.print(j % 2);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}
