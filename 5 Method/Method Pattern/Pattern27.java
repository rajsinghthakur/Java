import java.util.Scanner;

class P27 {
    public void test(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == n || i == j)
                    System.out.print(j % 2);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P27 obj = new P27();
        obj.test(n);
    }
}
