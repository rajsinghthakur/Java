 
import java.util.Scanner;

class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        double pi = 3.142, area;
        area = pi * radius * radius;
        System.out.println("area of circle : " + area);

    }
}
