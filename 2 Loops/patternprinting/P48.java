package patternprinting;

public class P48 {
    public static void main(String[] args) {
        char i, j, sp;
        for (i = 'A'; i <= 'E'; i++) {
            for (sp = 'E'; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (j = 'A'; j <= i; j++) {
                if (i == 'E' || j == 'A' || i == j)
                    System.out.print(j);
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }
}
