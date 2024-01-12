import java.util.InputMismatchException;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                System.out.println("Enter the String :");
                String a = sc.nextLine();
                System.out.println("index position : " + a.charAt(5));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Length is to short ");
            }
            System.out.println("Enter two values a & b :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result :" + c);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Somthing want worng");
        }
        System.out.println("Program complete....................");
    }
}