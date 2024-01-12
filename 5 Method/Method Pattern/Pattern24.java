import java.util.Scanner;

class P24 {
    public void test(int n) {
        char i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == n || i == j)
                    System.out.print("*");
                else
                    System.out.print("@");
            }
            System.out.println();
        }
    }
}

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P24 obj = new P24();
        obj.test(n);
    }
}
