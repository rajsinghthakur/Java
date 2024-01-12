package Array.Assignment4;

public class A5 {
    public static void main(String[] args) {
        int min = 21474836, secondmin = 21474836;
        int max = -21474836, secondmax = -21474836, minindex = 0, maxindex = 0;
        int i, j, sum = 0, temp;
        int a[][] = {
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 3, 3, 3, 1 }
        };
        int arrsum[] = new int[a.length];
        System.out.println("Given array of sum is : ");
        for (i = 0; i < a.length; i++) {
            sum = 0;
            for (j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
                System.out.print(a[i][j] + " ");
            }
            arrsum[i] = sum;
            System.out.print("= " + sum);
            System.out.println();
        }
        for (i = 0; i < a.length; i++) {
            if (min > arrsum[i]) {
                secondmin = min;
                min = arrsum[i];
            } else if (arrsum[i] < secondmin && min != arrsum[i]) {
                secondmin = arrsum[i];
            }
        }
        for (i = 0; i < a.length; i++) {
            if (max < arrsum[i]) {
                secondmax = max;
                max = arrsum[i];
            } else if (arrsum[i] > secondmax && max != arrsum[i]) {
                secondmax = arrsum[i];
            }
        }
        System.out.println("\nsecondmin : " + secondmin);
        System.out.println("secondmin : " + secondmax);

        temp = 0;
        for (i = 0; i < a.length; i++) {
            temp = a[minindex][i];
            a[minindex][i] = a[maxindex][i];
            a[maxindex][i] = temp;

        }
        System.out.println("After Swapping: ");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}