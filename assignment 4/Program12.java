import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number : ");
        int number = sc.nextInt();

        if ((number >= 1000) && (number <= 9999)) {
            int reverse = 0;
            while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
            System.out.println("reverse number is      : " + reverse);
        } else
            System.out.println("Invalid input number .");

    }
}
