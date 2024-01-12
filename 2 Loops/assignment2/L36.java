package Loops.assignment2;

import java.util.Scanner;

public class L36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int m = sc.nextInt();
        int n = m;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("reverse is : " + rev);
    }
}