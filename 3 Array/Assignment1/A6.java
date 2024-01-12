package Array.Assignment1;
/*wap to find and print prime numbers in given array */

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter five number : ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Prime number is : ");
        for (int i = 0; i < 5; i++) {
            if (a[i]<=1)
                System.out.print(a[i] + " ");
        }
    }
}
