package Array.Assignment3;

public class A6 {
    public static void main(String[] args) {
        int i, j, temp = 0;
        int a[] = { 0, 2, 0, 1, 2, 0, 2, 1 };
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }
    }
}
