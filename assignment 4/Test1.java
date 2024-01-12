
import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();

        if (l == b) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is a rectangle.");
        }
    }
}
