package patternprinting;

public class P12 {
    public static void main(String[] args) {
        char i, j;
        for (i = 'a'; i <= 'e'; i++) {
            for (j = 'a'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
