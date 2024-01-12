class Q16 {
    public static void main(String[] args) {
        int a = 1124;
        int b = a;
        int rem;
        int sum = 0;
        int multi = 1;
        for (a = 1; a != 0;) {
            rem = a % 10;
            sum = sum + rem;
            multi = multi * rem;
            a = a / 10;

        }
        if (sum == multi) {
            System.out.println(b + " is spy number");
        } else
            System.out.println(b + " is not spy number");
    }
}
