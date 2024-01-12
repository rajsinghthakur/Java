import java.util.Scanner;

class Divide {
    public void test(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(1 + "/" + i + " + ");
        }
    }
}

public class Method19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int x = sc.nextInt();
        Divide obj = new Divide();
        obj.test(x);
    }

}
