package patternprinting;

public class P96 {
    public static void main(String[] args) {
        int i, j, k;
        int a = 1;
        for (i = 1; i <= 5; i++) {

            for (j = 1; j <= 5; j++) {

                if ((i+j)%2==0)
                    System.out.print(j+" ");
                 else
                    System.out.print("* ");
            }

            System.out.println();

        }
    }
}
