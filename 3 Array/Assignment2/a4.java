/*Write a Java program to swap first and last element of an integer 1-d array. */
package Array.Assignment2;

import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Element of array :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int swap = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = swap;
        System.out.print("Swap first and last element :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
