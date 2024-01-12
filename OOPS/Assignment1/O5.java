import java.util.Scanner;

class MathOperation {
    private int a, b;

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        int add = a + b;
        System.out.println("add : " + add);
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    int getA() {
        return a;
    }

    int getB() {
        return b;
    }

    public void sub() {
        int sub = a - b;
        System.out.println("sub : " + sub);
    }

    public void mul() {
        int mul = a * b;
        System.out.println("mul : " + mul);
    }

    public void div() {
        int div = a / b;
        System.out.println("div : " + div);
    }
}

public class O5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 4;
        MathOperation obj = new MathOperation();
        obj.set(a, b);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        System.out.println("press 1 to update the value of a: ");
        System.out.println("press 2 to update the value of b: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the correct value of a : ");
                a = sc.nextInt();
                obj.setA(a);
                int getA = obj.getA();
                System.out.println("The updated value of 1 number is : " + getA);
                break;
            case 2:
                System.out.println("Enter the correct value of b : ");
                b = sc.nextInt();
                obj.setB(b);
                int getB = obj.getB();
                System.out.println("The updated value of 2 number is : " + getB);
        }
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();

    }

}
