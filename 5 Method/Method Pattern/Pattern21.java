import java.util.Scanner;

class P21 {
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

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P21 obj = new P21();
        obj.test(n);
    }
}
