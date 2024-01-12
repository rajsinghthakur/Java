import java.util.Scanner;

class Starhase {
    public void test(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                System.out.print(" * ");
            else
                System.out.print(" # ");
        }
    }
}

public class Method27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        Starhase obj = new Starhase();
        obj.test(n);

    }
}
