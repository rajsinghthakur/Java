package Loops.assignment2;

import java.util.Scanner;

public class L21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int j = i;
            int k = i * j;
            System.out.print(k + ", ");
        }
    }
}
