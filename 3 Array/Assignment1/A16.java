package Array.Assignment1;

/* Write a Java program to calculate the average value of array elements*/
import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the number : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        sum = (sum / n);
        System.out.println("sum : " + sum);

    }
}