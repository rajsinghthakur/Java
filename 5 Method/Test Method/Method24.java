import java.util.Scanner;

class EvenSqure {
    public void test(int n) {
        for (int i = 0; i < n * 2; i += 2) {
            System.out.print(i * i + " ");
        }
    }
}

public class Method24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        EvenSqure r = new EvenSqure();
        r.test(n);
    }
}
