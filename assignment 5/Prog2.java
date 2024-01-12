import java.util.Scanner;

class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double Length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double Breadth = sc.nextDouble();

        double area = Length * Breadth;
        System.out.println("area of rectangle : " + area);

    }
}