class DigonalLine {
    public void test() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        DigonalLine obj = new DigonalLine();
        obj.test();
    }
}
