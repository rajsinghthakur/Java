import java.util.Scanner;

class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("English   : ");
        int E = sc.nextInt();
        System.out.print("Hindi     : ");
        int H = sc.nextInt();
        System.out.print("Maths     : ");
        int M = sc.nextInt();
        System.out.print("Physics   : ");
        int P = sc.nextInt();
        System.out.print("Chemistry : ");
        int C = sc.nextInt();
        double add = E + H + M + P + C;
        System.out.println("Total : " + add);
        double parcentage = (add / 500) * 100;
        System.out.println("parcentage : " + parcentage);
        String division = (60 <= parcentage) ? "First Division"
                : (parcentage >= 50) ? "second division" : (parcentage >= 33) ? "Third division" : "Fail";
        System.out.println("division : " + division);
    }
}
