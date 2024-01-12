import java.util.Scanner;

class P23 {
    public void test(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == n || i == j)
                    System.out.print(i);
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P23 obj = new P23();
        obj.test(n);
    }
}
