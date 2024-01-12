class Increment3 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 30;
        b = 15;
        c = 12;
        d = 25;

        a = a++;
        b = a++;
        c = ++b;
        a = ++d;
        d = c++;
        b = d++;

        System.out.println("a :" + a);
        System.out.println("b :" + b);
        System.out.println("c :" + c);
        System.out.println("d :" + d);
    }
}
