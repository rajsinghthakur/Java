public class Q42 {
    public static void main(String[] args) {
        int a[] = { 7, 1, 8, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9 };

        String s = "";
        System.out.print("result :- ");
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {
                s = s + a[i];
            }
        }
        char c[] = s.toCharArray();
        int b[] = new int[c.length];
        for (int k = 0; k < c.length; k++) {
            b[k] = ((int) c[k] - 48);
        }

        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] + " ");
        }
    }
}