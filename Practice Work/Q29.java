import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = n - 2; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // if (j >= (n + 1) - i)
        // System.out.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
    }
}