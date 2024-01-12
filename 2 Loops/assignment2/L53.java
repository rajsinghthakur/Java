
package Loops.assignment2;

import java.util.Scanner;

public class L53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int f = sc.nextInt();
        System.out.print("Enter the last value  :");
        int l = sc.nextInt();
        System.out.println("Strong Number between " + f + " and " + l + " is : ");
        for (int k = f; k < l; k++) {
            int n = k;
            int temp = n;
            int r;
            int sum = 0;
            for (n = n; n > 0;) {
                r = n % 10;
                n = n / 10;
                int fact = 1;
                for (int i = 1; i <= r; i++) {
                    fact = fact * i;
                }
                sum = sum + fact;
            }
            if (sum == temp) {
                System.out.println(temp + " ");
            }
        }
    }
}
