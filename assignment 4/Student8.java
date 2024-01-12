import java.util.Scanner;

public class Student8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of student : ");
        String name = sc.nextLine();
        System.out.print("Number of class held : ");
        int held = sc.nextInt();
        System.out.print("Number of classes attended : ");
        int attend = sc.nextInt();
        double p = ((attend * 100) / held);
        System.out.println("Percentage of class attended : " + p + "%");
        if (75.0 > p)
            System.out.print("If medical cause : y or no ? ");
        char madical = sc.next().charAt(0);
        if ((madical == 'y') || (p >= 75)) {
            System.out.print("you are Eligible ");
        } else {
            System.out.print("you are not Eligible because attendence is less then 75% and no medical cirtificate. ");
        }
    }
}
