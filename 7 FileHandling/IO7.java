import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IO7 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("C:/Users/rajth/OneDrive/Desktop/FileHandling.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            String s = "";
            System.out.print(s);
            // while ((int i = f.read()) != -1) {
            // s = s + ((char) i);
            // }
            // System.out.print(s);
        } catch (Exception e) {
            System.out.println("somthin want wrong");
        }
    }
}
