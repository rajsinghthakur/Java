package Array.Assignment4;

public class A5 {
    public static void main(String[] args) {
        int i, j, k, sum = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, max = 0, swap = 0, temp;
        int a[][] = {
                { 1, 1, 1, 1 },
                { 2, 2, 1, 2 },
                { 3, 3, 2, 3 },
                { 3, 3, 3, 1 }
        };
        System.out.println("Given array of sum is : ");
        for (i = 0; i < a.length; i++) {
            sum = 0;
            for (j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
                System.out.print(a[i][j] + " ");

            }
            System.out.print("= " + sum);
            System.out.println();

            if (i == 0)
                sum1 = sum;
            if (i == 1)
                sum2 = sum;
            if (i == 2)
                sum3 = sum;
            if (i == 3)
                sum4 = sum;
        }

        int ar[] = new int[a.length];
        ar[0] = sum1;
        ar[1] = sum2;
        ar[2] = sum3;
        ar[3] = sum4;
        System.out.print("\nsorted sum is : ");
        for (i = 0; i < ar.length; i++) {
            for (j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
            System.out.print(ar[i] + " ");
        }
        System.out.println("\n\n2nd minimum is : " + ar[1]);
        System.out.println("2nd maximum is : " + ar[ar.length - 2]);
        int x = 2;
        int y = 4;
        temp = 0;
        for (i = 0; i < 4; i++) {
            temp = a[(x - 1)][i];
            a[x - 1][i] = a[y - 1][i];
            a[y - 1][i] = temp;
        }
        System.out.println();
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
