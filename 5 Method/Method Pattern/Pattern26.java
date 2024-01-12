import java.util.Scanner;

class P26 {
    public void test(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print("#");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P26 obj = new P26();
        obj.test(n);
    }
}
