import java.io.File;
import java.util.Scanner;

public class IO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = "";
        try {
            File myObj = new File("C:/Users/rajth/OneDrive/Desktop/Admin.txt");
            Scanner sc1 = new Scanner(myObj);
            while (sc1.hasNextLine()) {
                data = sc1.nextLine();
                System.out.println(data);
            }
            sc1.close();
            System.out.println("Successfull ");
        } catch (Exception e) {
            System.out.println("An error occurred. ");
            e.printStackTrace();
        }
        System.out.println("searc the content :");
        String search = sc.nextLine();
        System.out.println(data.contains(search));
    }
}
