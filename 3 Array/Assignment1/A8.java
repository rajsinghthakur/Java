package Array.Assignment1;

/* Write a program to find the sum and product of all elements of an array. 
*/
import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter five number : ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int product =1;
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
            product = product * a[i];
        }
        System.out.println("sum : " + sum);
        System.out.print("product : " + product);
    }
}
