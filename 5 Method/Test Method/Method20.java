import java.util.Scanner;

class Seven {
    public void test(int n) {
        for (int i = 0; i < n * n; i += 7) {
            System.out.print(i + " ");
        }
    }
}

public class Method20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int x = sc.nextInt();
        Seven obj = new Seven();
        obj.test(x);
    }

}
