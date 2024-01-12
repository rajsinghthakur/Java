import java.util.Scanner;

class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        boolean U = ((c >= 'A') && (c <= 'Z'));
        System.out.println((U) ? "The character is uppercase." : "The character is not uppercase.");
    }
}
