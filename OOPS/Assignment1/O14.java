import java.util.Scanner;

class MathOperation {
    float x, y;
    float R;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        R = x + y;
    }

    public void sub() {
        R = x - y;
    }

    public void mul() {
        R = x * y;
    }

    public void div() {
        R = x / y;
    }

    void display() {
        System.out.println("Result : " + R);
    }

}

public class O14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        MathOperation obj = new MathOperation();
        obj.set(x, y);
        obj.add();
        obj.display();
        obj.sub();
        obj.display();
        obj.mul();
        obj.display();
        obj.div();
        obj.display();

    }

}
