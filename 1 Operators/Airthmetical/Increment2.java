class Increment2 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 5;
        b = 20;
        c = 15;
        d = 30;
        a = ++b;
        c = b++;
        d = c++;
        c = ++a;
        b = d++;
        System.out.println("a :" + a);
        System.out.println("b :" + b);
        System.out.println("c :" + c);
        System.out.println("d :" + d);
    }
}
