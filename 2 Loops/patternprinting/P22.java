package patternprinting;

public class P22 {
    public static void main(String[] args) {
        char i, j;
        for (i = 65; i <= 69; i++) {
            for (j = 65; j <= i; j++) {
                if (j == 65 || i == 69 || i == j)
                    System.out.print(j+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
