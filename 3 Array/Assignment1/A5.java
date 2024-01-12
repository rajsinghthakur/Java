package Array.Assignment1;
/*wap to find and print even numbers in given array */

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the five value :");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Even no is : ");
        for (int i = 0; i < 5; i++) {
            if ((a[i] % 2) == 0) {
                System.out.print(a[i] + " ");

            }
        }
    }
}
