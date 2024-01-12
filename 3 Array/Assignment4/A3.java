package Array.Assignment4;

public class A3 {
    public static void main(String[] args) {
        int a[][] = { { 3, 7, 8 }, { 12, 5, 9 }, { 13, 15, 4 } };
        int i, j, k, max = 0, sum = 0, index = 0, temp = 0;
        System.out.println("sum is: ");

        for (i = 0; i < a.length; i++) {
            sum = 0;
            for (j = 0; j < a.length; j++) {
                sum = sum + a[i][j];
            }
            System.out.println(sum);
            if (max < sum) {
                index = i;
                max = sum;
            }
        }
        System.out.println("maximum sum is : ");
        System.out.println(max);

        System.out.println("Element is: ");
        for (j = 0; j < a.length; j++) {
            System.out.print(a[index][j] + " ");
        }
    }
}
