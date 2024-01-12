import java.util.Scanner;

class Prog16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature : ");
        double F = sc.nextDouble();
        double C = (F - 32) * 5 / 9;
        System.out.println("Temperature fahrenheit to celcius is : " + C);
    }
}
