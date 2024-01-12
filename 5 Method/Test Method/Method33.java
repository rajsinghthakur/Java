
class ReverseAlpha {
    public void test() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
    }
}

public class Method33 {
    public static void main(String[] args) {
        ReverseAlpha object = new ReverseAlpha();
        object.test();
    }
}
