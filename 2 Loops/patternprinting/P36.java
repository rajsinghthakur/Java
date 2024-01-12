package patternprinting;

public class P36 {
    public static void main(String[] args) {
        char i, j;
        for (i = 'E'; i >= 'A'; i--) {
            for (j = 'A'; j <= i; j++) {
                if (i == 'E' || i == j || j == 'A')
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
