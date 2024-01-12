package Array.Assignment1;
/*wap to print max and minimum value in given array */

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the five value :");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0], min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] > max) {
                min = a[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
