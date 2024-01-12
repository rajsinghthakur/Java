package Array.Assignment1;

/*Write a program in to array size to be user input print it */
import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the number of element : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("element of array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
