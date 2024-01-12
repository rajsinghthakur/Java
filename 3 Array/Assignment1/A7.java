package Array.Assignment1;
/*wap to search a particular number in given array and print its position  */

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter five number : ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Search number : ");
        int s = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (a[i] == s)
                System.out.println("Position in : " + i);
        }
    }
}
