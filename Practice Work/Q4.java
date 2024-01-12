package ClassWork;

import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        int sum = 1;
        for (int i = a; i >= 1; i--) {
            sum = sum * i;
        }
        System.out.println("Factorial of " + a + " is " + sum);
    }
}