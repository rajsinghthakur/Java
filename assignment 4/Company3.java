import java.util.Scanner;

class Company3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the salary in amount : ");
        int a = sc.nextInt();

        System.out.print("Enter year of service : ");
        int s = sc.nextInt();

        double bonus = (a*5)/100;

        if (s>=5) {
            System.out.println("Net bonus : "+bonus);
        } else {
            System.out.println("Under in five year of service");
        }
    }
}
