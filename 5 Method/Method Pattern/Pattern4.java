class SqureBox {
    public void test() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern4 {
    public static void main(String[] args) {
        SqureBox obj = new SqureBox();
        obj.test();
    }
}
