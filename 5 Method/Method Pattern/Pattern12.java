
import java.util.Scanner;

class P12 {
    public void test(int n) {
        char i, j;
        for (i = 'a'; i <= 'a' + (n - 1); i++) {
            for (j = 'a'; j <= i; j++) {
                System.out.print((j));
            }
            System.out.println();
        }
    }
}

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P12 obj = new P12();
        obj.test(n);
    }
}
