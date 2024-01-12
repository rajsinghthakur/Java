package Loops.assignment2;

import java.util.Scanner;

public class L13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        System.out.print("Natural no. in reverse order ");
        for (int i = n+1; i > 0; i--) {
            System.out.println(i);
        }
    }
}
