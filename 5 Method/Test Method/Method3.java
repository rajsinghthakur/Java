
import java.util.Scanner;

class pass {
    public void test(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

public class Method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vakue of N : ");
        int n = sc.nextInt();
        pass obj = new pass();
        obj.test(n);
    }
}
