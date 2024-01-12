package patternprinting;

public class P14 {
    public static void main(String[] args) {
        int i, j;
        int a=1;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
