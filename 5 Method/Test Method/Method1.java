package Method;

class pass {
    public void test(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("hello");
        }
    }
}

public class Method1 {
    public static void main(String[] args) {
        pass obj = new pass();
        obj.test(1000);
    }
}
