package Loops.assignment2;

import java.util.Scanner;

public class L17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int j = 0;
        for (int i = 1; i <= n * 2; i = i + j) {
            System.out.print(i + " ");
            j++;
        }
    }
}
