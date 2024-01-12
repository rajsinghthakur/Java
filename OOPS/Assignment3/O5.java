import java.util.Scanner;

class Book {
    public Book(String title, String Authore, String isbn) {

    }

}

public class O5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String re = "\u001B[0m", W = "\u001B[47m", b = "\u001B[30m";
        String a[] = { "Title", "Author", "ISBN number" };
        String arr[][] = new String[100][3];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("**************************\n         BOOK-" + (i + 1) + "\n**************************");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter " + a[j] + " of the book : ");
                arr[i][j] = sc.nextLine();
            }
            System.out.print("\nDo you want to add more data : ");
            String s = sc.nextLine();
            count++;
            if (s.equals("1") || s.equals("y") || s.equals("yes")) {

            } else {
                break;
            }
        }
        System.out.println("_____________________________________________________________________");
        System.out.println(W + b + "| Sno. |" + "Title               " + "Author              " + "ISBN number         |" + re);
        System.out.println(W + b + "|______|____________________________________________________________|" + re);
        for (int i = 0; i < count; i++) {
            System.out.printf(W + b + "| %-5s|", (i + 1));
            System.out.printf(W + b + "%-20s", (arr[i][0]));
            System.out.printf(W + b + "%-20s", (arr[i][1]));
            System.out.printf(W + b + "%-20s|"+re+"\n", (arr[i][2]));
        }
        System.out.println(W + b + "|______|____________________________________________________________|" + re);
    }
}
