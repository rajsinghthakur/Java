
class P89 {
    public void test() {
        for (int i = 1; i <= 11; i += 2) {
            for (int k = 10; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2);
            }
            System.out.println();
        }
    }
}

public class Pattern89 {
    public static void main(String[] args) {
        P89 obj = new P89();
        obj.test();
    }
}
