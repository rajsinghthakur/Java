class Test {
    void test() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Q8 {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.test();
    }
}