public class Q31 {
    public static void main(String[] args) {
        boolean res = true;
        for (int i = 1; i <= 10; i += 2) {
            for (int j = 1; j <= 10; j += 2) {
                if (j <= 10 - i || j % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= 6 - i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
