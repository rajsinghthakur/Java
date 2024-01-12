import java.util.Scanner;

class School4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of student : ");
        String name = sc.nextLine();

        System.out.print("Enter persentage : ");
        double p = sc.nextDouble();

        if (p <= 25)
            System.out.println("Grade : F");
        else if (p >= 25 && p <= 45)
            System.out.println("Grade : E");
        else if (p >= 45 && p <= 50)
            System.out.println("Grade : D");
        else if (p >= 50 && p <= 60)
            System.out.println("Grade : C");
        else if (p >= 60 && p <= 80)
            System.out.println("Grade : B");
        else if (p >= 80)
            System.out.println("Grade : A");
    }
}