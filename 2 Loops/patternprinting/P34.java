package patternprinting;

public class P34 {
    public static void main(String[] args) {
        char i, j;
        for (i = 69; i >= 65; i--) {
            for (j = 65; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
