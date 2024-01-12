import java.util.Scanner;

class Student {
    int rollNo;
    int percentage;

    public Student() {
    }

    public Student(int rollNo, int percentage) {
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    public void show() {
        System.out.println("Roll no. is : " + rollNo + " percentage is : " + percentage);
    }
}

class CollegeStudent extends Student {
    private int semester;

    public CollegeStudent() {
    }

    public CollegeStudent(int semester, int rollNo, int percentage) {
        super(rollNo, percentage);
        this.semester = semester;
    }

    public void show() {
        super.show();
        System.out.println("semester is : " + semester);
    }
}

class SchoolStudent extends Student {
    private int className;

    public SchoolStudent() {

    }

    public SchoolStudent(int className, int rollNo, int percentage) {
        super(rollNo, percentage);
        this.className = className;
    }

    public void show() {
        super.show();
        System.out.println("class name is " + className);
    }
}

public class Inh8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of school student : ");
        int n = sc.nextInt();
        System.out.println("Enter no. of college student : ");
        int m = sc.nextInt();
        Student std[] = new Student[n + m];
        for (int i = 0, j = 0; i < n + m; i++) {
            if (i < n) {
                System.out.println("Enter information of School student : " + (i + 1));
                System.out.print("enter class of student : ");
                int className = sc.nextInt();
                System.out.print("Enter rollNo. of student : ");
                int rollNo = sc.nextInt();
                System.out.print("Enter percentage of student : ");
                int percentage = sc.nextInt();
                std[i] = new SchoolStudent(className, rollNo, percentage);
            } else {
                System.out.println("Enter information of college student : " + (j + 1));
                j++;
                System.out.print("enter semester of student : ");
                int semester = sc.nextInt();
                System.out.print("Enter rollNo. of student : ");
                int rollNo = sc.nextInt();
                System.out.print("Enter percentage of student : ");
                int percentage = sc.nextInt();
                std[i] = new CollegeStudent(semester, rollNo, percentage);
            }
        }

        int count = 0;
        for (int i = 0; i < std.length; i++) {
            std[i].show();
            if (std[i].percentage >= 75) {
                count++;
            }
        }
        System.out.println("Student which have grade A : " + count);
    }
}