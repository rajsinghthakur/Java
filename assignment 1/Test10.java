import java.util.Scanner;

class Test10 {
    public static void main(String[] args) {
        double p, i, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal amount : ");
        p = sc.nextDouble();
        System.out.print("Interest rate    : ");
        i = sc.nextDouble();
        System.out.print("Time duration(in years)  : ");
        t = sc.nextDouble();
        double CI = p*(Math.pow((1+i/100),t))-p;
        System.out.println("compound interest  : " + CI);
    }
}
