import java.util.Scanner;

class AlphabetLower {
    public void test(char a) {
        System.out.print("lowercase is : ");
        char alpha = (char) (a + 32);
        System.out.println(alpha);
    }
}

public class Method15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Upparcase latter : ");
        char a = sc.nextLine().charAt(0);
        AlphabetLower obj = new AlphabetLower();
        obj.test(a);
    }
}
