import java.util.Scanner;

class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String in Uppercase: ");
        String U = sc.nextLine();
        String L = U.toLowerCase();
        System.out.println("Result in Lowercase : "+L);
    }
}
