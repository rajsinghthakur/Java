import java.util.Scanner;

class Student {
    void test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of students ");
        String name[] = new String[5];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.nextLine();
        }
        System.out.println("Enter the Roll no. of students ");
        String roll[] = new String[5];
        for (int j = 0; j < name.length; j++) {
            System.out.print("Enter the Roll no. of students " + name[j] + " : ");
            roll[j] = sc.nextLine();
        }
        System.out.println("Enter the Age of students ");
        int age[] = new int[5];
        for (int k = 0; k < name.length; k++) {
            age[k] = sc.nextInt();
        }
        System.out.println("Enter the Score of students ");
        byte score[] = new byte[5];
        for (int s = 0; s < name.length; s++) {
            score[s] = sc.nextByte();
        }
        System.out.println("\tSTUDENT\t");
        System.out.println("Name\t" + "Rool \t" + "Age\t" + "Score");

        System.out.println("------------------------------");
        System.out.println("Score group [0-50] students is ");
        System.out.println("------------------------------");
        for (int s = 0; s < name.length; s++) {
            if (score[s] >= 0 && score[s] < 50)
                System.out.println(name[s] + "\t" + roll[s] + "\t" + age[s] + "\t" + score[s]);
        }
        System.out.println("------------------------------");
        System.out.println("Score group [50-65] students is ");
        System.out.println("------------------------------");
        for (int s = 0; s < name.length; s++) {
            if (score[s] >= 50 && score[s] < 65)
                System.out.println(name[s] + "\t" + roll[s] + "\t" + age[s] + "\t" + score[s]);
        }
        System.out.println("------------------------------");
        System.out.println("Score group [65-80] students is ");
        System.out.println("------------------------------");
        for (int s = 0; s < name.length; s++) {
            if (score[s] >= 65 && score[s] < 80)
                System.out.println(name[s] + "\t" + roll[s] + "\t" + age[s] + "\t" + score[s]);
        }
        System.out.println("------------------------------");
        System.out.println("Score group [80-50] students is ");
        System.out.println("------------------------------");
        for (int s = 0; s < name.length; s++) {
            if (score[s] >= 80 && score[s] <= 50)
                System.out.println(name[s] + "\t" + roll[s] + "\t" + age[s] + "\t" + score[s]);
        }
        System.out.println("------------------------------");
    }
}

public class O19 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.test();
    }
}
