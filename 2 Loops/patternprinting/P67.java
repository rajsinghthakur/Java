package patternprinting;

public class P67 {
    public static void main(String[] args) {
        char i, j;
        char a = 'A';
        for (i = 65; i <= 74; i += 2) {
            for (int k = 73; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (j = 65; j <= i; j++) {
                if (i == 73 || j == 65 || j == i) {
                    System.out.print(a);
                } else
                    System.out.print(" ");
            }
            a++;
            System.out.println();
        }
    }
}
