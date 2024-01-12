import java.util.Scanner;

class Prog20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String in Lowercase : ");
        char c = sc.next().charAt(0);
        if (c >= 65 && c <= 122)
            System.out.println("Result is Alphabet : ");
        else
            System.out.println("Result is not Alphabet : ");

    }
}
