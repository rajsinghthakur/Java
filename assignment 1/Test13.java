import java.util.Scanner;

class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String in Lowercase : ");
        String L = sc.nextLine();
        String U = L.toUpperCase();
        System.out.println("Result in Uppercase : "+U);
    }
}
