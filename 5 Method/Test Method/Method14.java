import java.util.Scanner;

class Alphabet {
    public void test(char a) {
        System.out.print("Uppercase is : ");
        char alpha = (char) (a - 32);
        System.out.println(alpha);
    }
}

public class Method14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lowercase latter : ");
        char a = sc.nextLine().charAt(0);
        Alphabet obj = new Alphabet();
        obj.test(a);
    }
}
