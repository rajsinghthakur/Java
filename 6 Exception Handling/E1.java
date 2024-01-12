import java.util.InputMismatchException;
import java.util.Scanner;

class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first value ");
            int a = sc.nextInt();

            System.out.print("Enter the second value ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("Result : " + c);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid Integer");
        } catch (ArithmeticException e) {
            System.out.println("Invelid input");
        }

        System.out.println("complete.................");
        System.out.println("complete.................");

    }
}