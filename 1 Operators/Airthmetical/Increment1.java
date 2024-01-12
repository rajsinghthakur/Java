public class Increment1 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 11;
        b = 12;
        c = 13;
        d = 14;

        a = b++;
        b = ++c;
        c = ++a;
        d = a++;
        a = ++d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
