import java.util.Scanner;

class Test6 {
    public static void main(String[] args) {
        double p, i, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal amount : ");
        p = sc.nextDouble();
        System.out.print("Interest rate    : ");
        i = sc.nextDouble();
        System.out.print("Time (in years)  : ");
        t = sc.nextDouble();
        double SI = (p * i * t) / 100;
        System.out.println("Simple interest  : " + SI);
    }
}
