package patternprinting;

public class P45 {
    public static void main(String[] args) {
        int i, j, sp;
        for (i = 5; i >= 1; i--) {
            for (sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (j = 5; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
