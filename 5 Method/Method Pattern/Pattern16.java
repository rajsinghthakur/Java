import java.util.Scanner;

class P16 {
    public void test(int n) {
        int i, j;
        char a = 'a';
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P16 obj = new P16();
        obj.test(n);
    }
}
