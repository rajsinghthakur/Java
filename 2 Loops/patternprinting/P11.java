package patternprinting;

public class P11 {
    public static void main(String[] args) {
        char i, j;
        for (i = 65; i <= 69; i++) {
            for (j = 65; j <= i; j++) {
                System.out.print((j));
            }
            System.out.println();
        }

    }
}
