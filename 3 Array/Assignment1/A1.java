package Array.Assignment1;

/*wap to define an array of integer of size 6 .Take input from user and display it in reverse
order*/
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        System.out.println(" enter number ");
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(" revers number ");
        for (int i = 5; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}
