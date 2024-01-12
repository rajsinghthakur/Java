import java.util.Scanner;

class Test9 {
    public static void main(String[] args) {
        double r, h, volume;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        r = sc.nextDouble();
        System.out.print("Enter the height : ");
        h = sc.nextDouble();
        volume = 22 / 7f * r * r * h;
        System.out.println("volume of cylinder :" + volume);
    }

}
