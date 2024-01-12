import java.util.Scanner;

class P11 {
    public void test(int n) {
        char i, j;
        for (i = 65; i <= 65 + (n - 1); i++) {
            for (j = 65; j <= i; j++) {
                System.out.print((j));
            }
            System.out.println();
        }
    }
}

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Tringle in number : ");
        int n = sc.nextInt();
        P11 obj = new P11();
        obj.test(n);
    }
}
