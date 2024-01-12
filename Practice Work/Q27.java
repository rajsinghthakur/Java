public class Q27 {
    public static void main(String[] args) {
        int a[] = { 7, 8, 6, 4, 5 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 1 + i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println("min : " + a[0]);
        System.out.println("min : " + a[a.length - 1]);
    }
}
