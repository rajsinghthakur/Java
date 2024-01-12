import java.util.Scanner;

public class B19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        System.out.print("Replace any character : ");
        char c1 = sc.next().charAt(0);
        System.out.print("Define new character : ");
        char c2 = sc.next().charAt(0);
        for (int i = 0; i < c.length; i++) {
            if (c[i] == c1) {
                c[i] = c2;
                System.out.print(c[i]);
            } else
                System.out.print(c[i]);
        }
    }
}
