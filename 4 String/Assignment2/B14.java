import java.util.Scanner;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter second String : ");
        String s2 = sc.nextLine();
        System.out.println("two string are equal : " + s1.equals(s2));
    }
}
