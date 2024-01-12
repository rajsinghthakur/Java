import java.util.Scanner;

class Employe {
    String name;
    int eno, salary;
    long phone;

    public void test(int eno[], String name[], int salary[], long phone[]) {

        for (int i = 0; i < eno.length; i++) {
            for (int j = i + 1; j < eno.length; j++) {
                if (eno[i] > eno[j]) {
                    int swap = eno[i];
                    eno[i] = eno[j];
                    eno[j] = swap;
                }
            }
            this.name = name[i];
            this.eno = eno[i];
            this.salary = salary[i];
            this.phone = phone[i];
            System.out.println(eno[i] + "\t" + name[i] + "\t" + salary[i] + "\t" + phone[i]);
        }
    }

}

public class Q14 {
    public static void main(String[] args) {
        Employe obj = new Employe();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the eno. of Employe ");
        int eno[] = new int[5];
        for (int j = 0; j < eno.length; j++) {
            eno[j] = sc.nextInt();
        }
        System.out.println("Enter the name of Employe ");
        String name[] = new String[5];
        for (int i = 0; i < eno.length; i++) {
            name[i] = sc.next();
        }
        System.out.println("Enter the salary of Employe ");
        int salary[] = new int[5];
        for (int k = 0; k < eno.length; k++) {
            salary[k] = sc.nextInt();
        }
        System.out.println("Enter the phone no. of Employe ");
        long phone[] = new long[5];
        for (int s = 0; s < eno.length; s++) {
            phone[s] = sc.nextInt();
        }
        System.out.println("\t    EMPLOYE\t");
        System.out.println("-----------------------------------");
        System.out.println("no.\t" + "Name \t" + "Salary\t" + "Phone no");
        System.out.println("-----------------------------------");
        obj.test(eno, name, salary, phone);
        System.out.println("-----------------------------------");
    }
}
