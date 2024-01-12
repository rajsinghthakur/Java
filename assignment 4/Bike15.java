import java.util.Scanner;

class Bike15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price of Bike : ");
        double p = sc.nextDouble();

        System.out.println("\n");
        System.out.println("Cost Price(In Rs)\t\tTax");

        if (p >= 100000)
            System.out.println("    " + p + "\t\t\t15%  ");
        else if ((p >= 50000) && (p < 100000))
            System.out.println("    " + p + "\t\t\t10%  ");
        else if (p < 50000)
            System.out.println("    " + p + "\t\t\t5%  ");

    }
}
