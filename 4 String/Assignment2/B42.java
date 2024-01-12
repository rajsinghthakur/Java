import java.util.*;

public class B42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String s1 = sc.nextLine();
        System.out.print("Enter targeted word to change : ");
        String target = sc.nextLine();
        System.out.print("Enter replacement word : ");
        String replace = sc.nextLine();
        String newone = s1.replace(target, replace);
        System.out.println("Replaced String : " + newone);
    }
}
