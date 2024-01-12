class Pattern {
    public void test() {
        for (int i = 68; i >= 65; i--) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}

public class Q13 {
    public static void main(String[] args) {
        Pattern obj = new Pattern();
        obj.test();
    }
}
