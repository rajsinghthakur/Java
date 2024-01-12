import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the String");
            String s = sc.nextLine();
            System.out.println("Index of : " + s.charAt(5));
            System.out.println("Enter the two values :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Result : " + c);
        } catch (Exception e) {
            if (e.getClass().getName().contains("IndexOutOfBoundsException")) {
                System.out.println("Length is to short");
            } else if (e.getClass().getName().contains("InputMismatchException")) {
                System.out.println("Invelid input");
            } else if (e.getClass().getName().contains("ArithmeticException")) {
                System.out.println("Divide by 0 is not posible");
            }
        } finally {
            System.out.println("finali excicuted :");
        }
        System.out.println("Exucution Complete.............");
    }
}
