package Array.Assignment3;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Peak elements are: ");
        if (a[0] > a[1]) {
            System.out.println(a[0]);
        }
        if (a[a.length - 1] > a[a.length - 2]) {
            System.out.println(a[a.length - 1]);
        }
        for (i = 1; i < a.length - 1; i++) {

            if (a[i] > a[i + 1] && a[i] > a[i - 1]) {
                System.out.println(a[i] + " ");
            }
        }
    }

}
