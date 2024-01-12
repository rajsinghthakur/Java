import java.util.Scanner;

class Prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("English   : ");
        double E = sc.nextDouble();

        System.out.print("Hindi     : ");
        double H = sc.nextDouble();

        System.out.print("Maths     : ");
        double M = sc.nextDouble();

        System.out.print("Physics   : ");
        double P = sc.nextDouble();

        System.out.print("Chemistry : ");
        double C = sc.nextDouble();

        double T = E + H + M + P + C;
        double p = ((T * 100) / 500);
        System.out.println("Total      : " + T);
        System.out.println("Percentage : " + p + " %");

    }
}
