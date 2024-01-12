import java.util.InputMismatchException;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            try {
                System.out.print("Enter the first value ");
                int a = sc.nextInt();

                System.out.print("Enter the second value ");
                int b = sc.nextInt();

                int c = a / b;
                System.out.println("Result : " + c);
                flag = false;

            } catch (InputMismatchException e) {
                System.out.println("Invelid input ");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("run time error");
                sc.nextLine();
            }
        }

        System.out.println("complete.................");

    }
}
