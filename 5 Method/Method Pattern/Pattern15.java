import java.util.Scanner;

class P15 {
    public void test(int n) {
        char i, j;
        for (i = 'A'; i <= 'A' + (n - 1); i++) {
            for (j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P15 obj = new P15();
        obj.test(n);
    }
}
