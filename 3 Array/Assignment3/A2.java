package Array.Assignment3;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, temp = 0, max = 0, min = 0;
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Element of array : ");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            min = a[0];
            max = a[a.length - 1];
        }
        System.out.println("minimum element is : " + min);
        System.out.println("maximum element is : " + max);
    }
}
