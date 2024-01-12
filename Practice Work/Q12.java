import java.util.Scanner;

class Radius {
    public void test() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = sc.nextInt();
        float total = (4 / 3f) * (3.14f) * r * r * r;
        System.out.println("Volume of Sphere is : " + total);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Radius obj = new Radius();
        obj.test();
    }
}
