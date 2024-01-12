public class FL18 {
    public static void main(String[] args) {
        int n, x, sum = 0;
        n = 4;
        x = 2;
        while (n != 0) {
            int p = 1;
            for (int i = n; i >= 1; i--) {
                p = p * x;
                sum = sum + p;
            }
            n--;
        }
    }
}
