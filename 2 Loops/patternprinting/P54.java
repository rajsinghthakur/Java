package patternprinting;

public class P54 {
    public static void main(String[] args) {
        char i, j;
        for (i = 69; i >= 65; i--) {
            for (int sp = 68; sp >= i; sp--)
                System.out.print(" ");
            for (j = 65; j <= i; j++) {
                if (i == 69 || j == 65 || j == i)
                    System.out.print(j);
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }

}
