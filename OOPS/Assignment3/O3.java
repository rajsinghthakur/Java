import java.util.Scanner;

import org.w3c.dom.css.Rect;

class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public void area() {
        System.out.println("Area of Rectangle : " + (width * height));
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle : " + (2 * (width + height)));
    }
}

public class O3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of rectangle : ");
        float width = sc.nextFloat();
        System.out.println("Enter height of rectangle : ");
        float height = sc.nextFloat();
        Rectangle obj = new Rectangle(width, height);
        obj.area();
        obj.perimeter();
    }
}
