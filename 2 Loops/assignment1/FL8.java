
import java.util.Scanner;

public class FL8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term : ");
        int n = sc.nextInt();
        int a = 0, b = 1, i;

        for (i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
