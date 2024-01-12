package Array.Assignment4;

public class A4 {
    public static void main(String[] args) {
        int a[][] = {
                { 3, 7, 8 },
                { 12, 5, 9 },
                { 13, 15, 4 }
        };
        int i, j, sum1 = 0, sum2 = 0, sum3 = 0, max = 0, index = 0;
        for (i = 0; i < a.length; i++) {
            int sum = 0;
            for (j = 0; j < a.length; j++) {
                sum = sum + a[i][j];
            }
            if (max < sum) {
                index = i;
                max = sum;
            }
        }
        for (j = 0; j < a.length; j++) {
            System.out.print(a[index][j] + " ");
        }
    }
}
