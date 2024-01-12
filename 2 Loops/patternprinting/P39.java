package patternprinting;

public class P39 {
    public static void main(String[] args) {
        int a, b;
        for (a = 1; a <= 5; a++) {
            for (b = 1; b <= 5; b++) {
                if (a % 2 == 0)
                    System.out.print(b);
                else
                    System.out.print(a);
            }
            System.out.println();
        }
    }
}
