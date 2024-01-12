import java.util.Scanner;

class Percantage14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the percantage : ");
        double p = sc.nextDouble();

        System.out.println("\n");
        System.out.println("Percantage\t\tGrade");

        if ((p >= 0) && (p <= 100)) {
            if (p >= 90)
                System.out.println("  " + p + " %    \t\t  A  ");
            else if ((p >= 80) && (p <= 89))
                System.out.println("  " + p + " %    \t\t  B  ");
            else if ((p >= 60) && (p <= 79))
                System.out.println("  " + p + " %    \t\t  C  ");
            else if (p <= 59)
                System.out.println("  " + p + " %    \t\t  D  ");
        } else
            System.out.println("Invalid Percantage");

    }
}
