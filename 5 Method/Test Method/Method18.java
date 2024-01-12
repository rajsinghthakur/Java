import java.util.Scanner;

class Seres3 {
    public void test(int n) {
        int a = 1, sum = 1;
        for (int i = 1; i <= n * 2; i++) {
            i = a * i;
            System.out.print(i + " ");
            a = i;
        }
    }
}

public class Method18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        Seres3 r = new Seres3();
        r.test(n);
    }
}
