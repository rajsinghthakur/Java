package Array.Assignment3;

public class A3 {
    public static void main(String[] args) {
        int i, j, temp = 0;
        int a[] = { 1, 2, 3, 4, 5 };
        for (i = 0; i < a.length; i++) {
            for (j = i+1; j < a.length; j++) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            System.out.print(a[i] + " ");
        }
    }
}
