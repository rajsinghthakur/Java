class And3 {
    public static void main(String[] args) {
        boolean x;
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        x = a > b && ++c < d || ++a < b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("d:" + d);
        System.out.println("x:" + x);
    }
}
