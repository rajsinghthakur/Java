
package Loops.assignment2;

import java.util.Scanner;

public class L51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int m = sc.nextInt();
        System.out.print("Enter second no. : ");
        int l = sc.nextInt();
        for (int k = m; k <= l; k++) {
            int n = k;
            int rev = 0;
            while (n != 0) {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            System.out.println(rev);
        }
    }
}