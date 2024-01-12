
class MathOperation {
    void multi(int a, int b) {
        int multi = a * b;
        System.out.println(multi);
    }

    void multi(float a, float b, float c) {
        float multi = a * b * c;
        System.out.println(multi);
    }

    void multi(int... a) {
        int multi = 1;
        for (int i = 0; i < a.length; i++) {
            multi = multi * a[i];
        }
        System.out.println(multi);
    }

    void multi(double a, int b) {
        double multi = a * b;
        System.out.println(multi);
    }

}

public class O15 {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        obj.multi(10, 20);
        obj.multi(10.2f, 20.5f, 10.9f);
        obj.multi(10.23, 10);
        obj.multi(1, 2, 3, 4, 5);
    }

}
