import java.util.Scanner;

class Eleven {
    public void test(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + "+");
            a = a * 10;
            a = a + 1;
        }
    }
}

public class Method30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        Eleven obj = new Eleven();
        obj.test(n);

    }
}
