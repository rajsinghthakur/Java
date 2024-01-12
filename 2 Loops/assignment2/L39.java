package Loops.assignment2;

import java.util.Scanner;

public class L39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int l = sc.nextInt();
        int n = l;
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
            System.out.println(temp + " is a strong number.");
        } else
            System.out.println(temp + " is not a strong number.");
    }
}
