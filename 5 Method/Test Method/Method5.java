import java.util.Scanner;

class fact {
    public int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

public class Method5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        fact obj = new fact();
        int result = obj.Factorial(n);
        System.out.println(result);
    }

}
