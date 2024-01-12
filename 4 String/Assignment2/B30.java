import java.util.Scanner;

public class B30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "( Write a Java Program To Count words In Given String )\n";
        System.out.println(s1);
        for (int z = 1; z <= 1;) {
            System.out.print("Enter the search word in given string : ");
            String s2 = sc.nextLine();
            char c1[] = s1.toCharArray();
            char c2[] = s2.toCharArray();
            int i, count = 0;
            boolean chek = false, condition = false;
            for (int j = 0; j < c1.length; j++) {
                if (c2[0] == c1[j]) {
                    condition = true;
                }
            }
            if (condition) {
                for (i = 0; i < c1.length; i++) {
                    if (c2[0] == c1[i]) {
                        break;
                    }
                    count++;
                }
                String st1 = "", st2 = "";
                for (i = count; i < count + c2.length; i++) {
                    st1 = st1 + c1[i];
                    st2 = st2 + c2[i - count];
                }
                if (st1.equals(s2))
                    System.out.println(s2 + ": is inside the string\n ");
                else
                    System.out.println(s2 + ": is not inside the string\n ");
            } else
                System.out.println(s2 + ": is not inside the string\n ");
        }
    }
}
