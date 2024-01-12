
class P75 {
    public void test() {
        for (int i = 9; i >= 1; i -= 2) {
            for (int k = 8; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1 || i == 9)
                    System.out.print(j);
                else
                    System.out.print("+");
            }
            System.out.println();
        }
    }
}

public class Pattern75 {
    public static void main(String[] args) {
        P75 obj = new P75();
        obj.test();
    }
}
