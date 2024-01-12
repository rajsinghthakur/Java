package Array.Assignment4;

public class A1 {
    public static void main(String[] args) {
        int a[][] = {
                { 8, 7, 3 },
                { 9, 5, 12 },
                { 13, 15, 4 }
        };
        int i, j, k, temp = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                for (k = j + 1; k < a[i].length; k++) {
                    if (a[i][j] > a[i][k]) {
                        // a[i][j] = a[i][j] + a[i][k];
                        // a[i][k] = a[i][j] - a[i][k];
                        // a[i][j] = a[i][j] - a[i][k];
                        temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }

                }

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
