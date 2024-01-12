public class Q19 {
    public static void main(String[] args) {
        int n = 5;
        int oc = 0;
        int ar[] = { 1, 2, 4, 3, 2,5,5, 5 };
        for (int i = 0; i < ar.length; i++) {
            if (n == ar[i]) {
                oc++;
            }
        }
        System.out.println(oc);
    }
}
