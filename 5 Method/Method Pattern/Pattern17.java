import java.util.Scanner;

class P17 {
    public void test(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (i % 2 == 0)
                    System.out.print("# ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P17 obj = new P17();
        obj.test(n);
    }
}
