package patternprinting;

public class P3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
