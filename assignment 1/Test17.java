import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height in inches : ");
        double height = sc.nextDouble();
        double inch = 2.54;
        double cm = height * inch;
        System.out.println("Height in CentiMeter : " + cm);
    }
}
