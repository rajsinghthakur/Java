class Decrement1 {
    public static void main(String[] args) {
        int a = 4;
        int r;
        r = ++a;
        System.out.println("Decrement :" + r);
        r = a++;
        System.out.println("Decrement :" + r);
        a+=r;
        System.out.println("Decrement :" + --a);

    }
}
