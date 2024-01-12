import java.util.Scanner;

class P10 {
    public void test(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Tringle in number : ");
        int n = sc.nextInt();
        StarTringle obj = new StarTringle();
        obj.test(n);
    }
}
