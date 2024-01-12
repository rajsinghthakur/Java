import java.util.Scanner;

class P18 {
    public void test(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j % 2);
            }
            System.out.println();
        }
    }
}

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P18 obj = new P18();
        obj.test(n);
    }
}
