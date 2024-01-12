import java.util.Scanner;

class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void set(float radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("\narea of Circle : " + ((22 / 7f) * radius * radius));
    }

    public void circumference() {
        System.out.println("circumference of Circle : " + (2f * (22 / 7f) * radius));
    }
}

public class O4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle : ");
        float radius = sc.nextFloat();
        Circle obj = new Circle(radius);
        obj.area();
        obj.circumference();
        System.out.println("\nDo you want to change radius\n\n\tYES or NO");
        String check = sc.next();
        if (check.equals("1") || check.equals("yes")) {
            System.out.println("Enter radius of Circle : ");
            float update = sc.nextFloat();
            obj.set(update);
            obj.area();
            obj.circumference();
        }
    }
}
