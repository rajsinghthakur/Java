package patternprinting;

public class P33 {
    public static void main(String[] args) {
        char i, j;
        for (i = 69; i >= 65; i--) {
            for (j = 65; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
