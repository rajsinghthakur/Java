import java.util.Scanner;

class Check {
    public void test() {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the value of Array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the search value : ");
        int s = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == s)
                check = true;
        }
        if (check)
            System.out.println("Number is exist : ");
        else
            System.out.println("Number is not exist : ");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Check obj = new Check();
        obj.test();
    }
}
