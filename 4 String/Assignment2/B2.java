import java.util.*;

public class B2 {
    public static void main(String[] args) {
        String s = "Raj Thakur";
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index value : ");
        int i = sc.nextInt();
        char c[] = s.toCharArray();
        int a;
        for (a = 0; a < c.length; a++) {
            if (i >= 1 && i <= c.length) {
                if (a + 1 == i)
                    System.out.println("Character at index " + i + ": " + c[a]);
            } else
                System.out.println("invelid index value ");
            break;
        }

    }
}