public class B43 {
    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 5, 4, 6, 6 };
        char c = 'A';
        double d = 12.5;
        boolean b = true;
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s = s + String.valueOf(a[i]);

        }
        System.out.println(s);
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(b));

    }
}
