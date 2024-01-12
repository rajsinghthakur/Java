package Array.Assignment3;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0, max = 0;
        int mink = 0, maxk = 0;
        System.out.println("enter the value of k");
        int k = sc.nextInt();
        int a[] = { 4, 6, 3, 2, 8, 5, 4, 1 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            min = a[0];
            max = a[a.length - 1];
            mink = a[k - 1];
            maxk = a[a.length - k];
        }
        System.out.println(k + "s minimum element is : " + mink);
        System.out.println(k + "s maximum element is : " + maxk);

    }
}
