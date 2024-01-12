import java.util.Scanner;

class OneBHK1 {
    private double r1;
    private double h;
    private double p;

    public OneBHK1() {

    }

    public OneBHK1(double r1, double h, double p) {
        this.r1 = r1;
        this.h = h;
        this.p = p;
    }

    public void show() {
        System.out.println("----------------------");
        System.out.println("TwoBHK Details:");
        System.out.println("----------------------");
        System.out.println("Room1 Area : " + r1);
        System.out.println("Hall Area  : " + h);
        System.out.println("Price      : " + p);
    }
}

class TwoBHK extends OneBHK1 {
    private double r2;

    public TwoBHK() {

    }

    public TwoBHK(double r1, double r2, double h, double p) {
        super(r1, h, p);
        this.r2 = r2;
    }

    public void show2() {
        super.show();
        System.out.println("Room2 Area : " + r2);
    }
}

public class Inh6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Information of 2BHK flat : ");
        System.out.print("How many flats are abelevel : ");
        int no = sc.nextInt();
        // int r1 = 0, r2 = 0, h = 0, p = 0;
        TwoBHK obj1[] = new TwoBHK[no];
        for (int i = 0; i < no; i++) {
            System.out.println("Enter the information of flat number : " + (i + 1));
            System.out.print("1st Room Area : ");
            int r1 = sc.nextInt();
            System.out.print("2nd Room Area : ");
            int r2 = sc.nextInt();
            System.out.print("Hall Area : ");
            int h = sc.nextInt();
            System.out.print("Price : ");
            int p = sc.nextInt();
            obj1[i] = new TwoBHK(r1, r2, h, p);
        }
        for (int i = 0; i < no; i++) {
            obj1[i].show2();
        }
        // TwoBHK obj1 = new TwoBHK(125, 135, 270, 45000);
        // TwoBHK obj2 = new TwoBHK(150, 155, 280, 50000);
        // TwoBHK obj3 = new TwoBHK(175, 170, 290, 55000);
        // obj1.show2();
        // obj2.show2();
        // obj3.show2();
        System.out.println();
    }
}
