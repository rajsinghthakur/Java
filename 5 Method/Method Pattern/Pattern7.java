class Tringle {
    public void test() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i % 2);
            }
            System.out.println();
        }
    }
}

public class Pattern7 {
    public static void main(String[] args) {
        Tringle obj = new Tringle();
        obj.test();
    }
}
