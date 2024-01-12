package Array.Assignment3;

import java.util.Scanner;

public class Ar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5 };
        int f = 0;
        System.out.print("Enter the serch element : ");
        int search = sc.nextInt();
        for (int i = 0; i <= a.length-1; i++) {
            if (search == a[i]) {
                f = 1;
            }
        }
        if (f == 1)
            System.out.println("Item is found");
        else
            System.out.println("Item not is found");

    }
}
