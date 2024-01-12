package patternprinting;

public class P95 {
    public static void main(String[] args) {
        int i, j, k;
        int a = 1;
        for (i = 1; i <= 5; i++) {

            for (j = 1; j <= 5; j++) {

                if (i == j) {
                    System.out.print("0 ");
                } else
                    System.out.print(j + " ");
            }

            System.out.println();

        }
    }
}
