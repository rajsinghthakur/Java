package Loops.assignment2;

import java.util.Scanner;

public class L16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        for (int i = -n; i <= n * 2; i += 3) {
            System.out.print(i + " ");
        }

    }
}
