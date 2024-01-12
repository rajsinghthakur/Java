package Loops.assignment2;

import java.util.Scanner;

public class L18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        for (int i = 2; i <= n * 2; i++) {
            int j = i;
            int k = j * (i);
            System.out.print(i + " ");
            i = k;
        }
    }
}
