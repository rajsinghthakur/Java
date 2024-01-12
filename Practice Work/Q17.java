class Q17 {
    public static void main(String[] args) {
        int n = 55;
        String s = n + "";
        int a = n * n;
        int rem1, rem2;
        rem1 = n % 10;
        rem2 = a % 10;
        if (rem1 == rem2) {
            System.out.println(n + " is Automorphic");
        } else
            System.out.println(n + " is not Automorphic");
    }
}
