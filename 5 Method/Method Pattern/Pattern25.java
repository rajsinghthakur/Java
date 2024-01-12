import java.util.Scanner;

class P25 {
    public void test(int n) {
        int i, j;
        for (i = n; i >= 1; i--) {
            for (j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P25 obj = new P25();
        obj.test(n);
    }
}
