import java.util.ArrayList;
import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(n);
        System.out.println("Enter values");
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            al.add(n1);
        }
        int temp = 0;
        for (int i = 0; i < al.size(); i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i) > al.get(i + 1)) {
                    al.set(i, al.get(i));
                    
                }
            }
        }
    }
}