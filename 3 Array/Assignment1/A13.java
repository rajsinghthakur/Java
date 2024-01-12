package Array.Assignment1;

/*Q-13. Write a program to array elements to print sum of Cubic Values */
import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. of element : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the values of array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int value = 0;
        System.out.print("cubic values :- ");
        for (int i = 0; i < n; i++) {
            value = a[i] * a[i] * a[i];
            sum = sum + value;
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("sum : " + sum);
    }
}
