package Array.Assignment4;

public class SecondMenimum {
    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 7, 7, 7, 6, 6, 6, 5, 5, 5, 4, 4, 4, 1, 4, 7, 5, 6 };
        int min = 21474836, secondmin = 21474836;
        int max = -21474836, secondmax = -21474836;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                secondmin = min;
                min = a[i];
            } else if (a[i] < secondmin && min != a[i]) {
                secondmin = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                secondmax = max;
                max = a[i];
            } else if (a[i] > secondmax && max != a[i]) {
                secondmax = a[i];
            }
        }
        System.out.println("min : " + min);
        System.out.println("secondmin : " + secondmin);
        System.out.println("min : " + max);
        System.out.println("secondmin : " + secondmax);
    }

}
