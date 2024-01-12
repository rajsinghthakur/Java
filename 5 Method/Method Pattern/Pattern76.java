class P76 {
    public void test() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                if (i <= 4)
                    System.out.print("*");
                // else if (i == 5 && j <= 3 || i == 6 && j <= 2 || i == 7 && j <= 1)
                else if (j==1)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern76 {
    public static void main(String[] args) {
        P76 obj = new P76();
        obj.test();
    }
}
