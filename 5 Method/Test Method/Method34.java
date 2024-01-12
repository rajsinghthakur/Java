import java.util.Scanner;

class Perfect {
    public void test(int n) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = scanner.nextInt();

        if (isPerfectNumber(n)) {
            System.out.println(n + " is perfect");
        } else
            System.out.println(n + " is not perfect");

    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }

        }

        return sum == number;
    }
}

public class Method34 {
    public static void main(String[] args) {
        Perfect obj = new Perfect();
        obj.test(0);
    }

}
