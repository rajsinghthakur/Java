package patternprinting;

public class P53 {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i >= 1; i--) {
            for (int sp = 4; sp >= i; sp--)
                System.out.print(" ");
            for (j = 1; j <= i; j++) {
                if (i == 5 || j == 1 || j == i)
                    System.out.print(i);
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }

}
