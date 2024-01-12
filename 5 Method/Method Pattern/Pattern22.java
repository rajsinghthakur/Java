import java.util.Scanner;

class P22 {
    public void test(int n) {
        char i, j;
        for (i = 65; i <= 65 + (n - 1); i++) {
            for (j = 65; j <= i; j++) {
                if (j == 65 || i == (65 + (n - 1)) || i == j)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Pattern : ");
        int n = sc.nextInt();
        P22 obj = new P22();
        obj.test(n);
    }
}
