import java.util.Scanner;

class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age :");
        int age = sc.nextInt();
        String eligible = (age < 18) ? "NotEligible" : "Eligible";
        System.out.println(eligible);
    }
}
