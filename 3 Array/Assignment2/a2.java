/*Write a program for Sorting an array */
package Array.Assignment2;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("sorting : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
            System.out.print(a[i] + " ");
        }
    }
}
