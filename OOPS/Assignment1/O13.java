import java.util.Scanner;

class A13 {
    float a;

    public void test(int r) {
        float area = 3.14f * r * r;
        this.a = area;
    }

    public void display() {

        System.out.println(a);
    }
}

public class O13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius : ");
        int r = sc.nextInt();
        A13 obj = new A13();
        obj.test(r);
        obj.display();

    }
}