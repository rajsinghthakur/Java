public class Q43 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) {
            for (int k = 9; k >= i; k -= 2) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1 || i == 9) {
                    System.out.print(j);
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
