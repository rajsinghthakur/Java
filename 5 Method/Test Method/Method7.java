import java.util.Scanner;

class Prime {
    public void Primenumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println("Enter number is Prime");
        else
            System.out.println("Enter number is not Prime");
    }
}

public class Method7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        Prime obj = new Prime();
        obj.Primenumber(n);
    }

}