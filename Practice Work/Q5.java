package ClassWork;

class Test {
    public void test() {
        for (int j = 1; j <= 100; j++) {
            int count = 0;
            for (int i = 2; i <= j - 1; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 0)
                System.out.println(j);
            else
                count = 0;
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.test();
    }
}
