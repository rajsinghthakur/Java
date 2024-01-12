package Array.Assignment3;

import java.util.Scanner;

public class Ar4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5 };
        int lr = 0;
        int up = a.length - 1;
        int f = 0;
        System.out.print("Enter the serch element : ");
        int search = sc.nextInt();

        while (lr <= up) {
            int mid = ((lr + up) / 2);
            if (mid == search) {
                f = 1;
            }
            if (mid < search)
                lr = mid + 1;
            else
                up = mid - 1;
        }
        if (f == 1)
            System.out.println("Item is found");
        else
            System.out.println("Item not is found");

    }
}
