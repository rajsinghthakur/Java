import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fathername = "";
        String str;
        String fn1 = "";
        str = "Father Name   : ";
        int end = 68 - (fathername.length());
        for (int i = 1; i <= end; i++) {
            if (i == 26)
                fn1 = fn1 + (str + fathername);
            else
                fn1 = fn1 + " ";
        }
        System.out.print("|" + fn1 + "|");
    }
}