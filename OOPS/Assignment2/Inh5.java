import java.util.Scanner;

class OneBHK {
    private double r;
    private double h;
    private double p;

    public OneBHK() {

    }

    public OneBHK(double r, double h, double p) {
        this.r = r;
        this.h = h;
        this.p = p;
    }

    public void show() {
        System.out.println("-------------------");
        System.out.println("OneBHK Details:");
        System.out.println("-------------------");
        System.out.println("Room Area : " + r);
        System.out.println("Hall Area : " + h);
        System.out.println("Price     : " + p);
    }
}

public class Inh5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data of 1 BHK flat : ");
        System.out.print("Room Area  : ");
        int r = sc.nextInt();
        System.out.print("Hall Area  : ");
        int h = sc.nextInt();
        System.out.print("Flat Price : ");
        int p = sc.nextInt();
        OneBHK obj = new OneBHK();
        OneBHK obj2 = new OneBHK(r, h, p);
        obj2.show();
    }
}
