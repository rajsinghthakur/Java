package patternprinting;

public class P46 {
    public static void main(String[] args) {
        char i, j, sp;
        for (i = 'A'; i <= 'E'; i++) {
            for (sp = 'E'; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
