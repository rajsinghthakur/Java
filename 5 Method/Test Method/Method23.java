import java.util.Scanner;

class OddSqure {
    public void test(int n) {
        for (int i = 1; i < n * 2; i += 2) {
            System.out.print(i * i + " ");
        }
    }
}

public class Method23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        OddSqure r = new OddSqure();
        r.test(n);
    }
}
