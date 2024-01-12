import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class IO5 {
    public static void main(String[] args) {
        try {

            File obj = new File("C:/Users/rajth/OneDrive/Desktop/sandeep.txt");
            if (!obj.exists()) {
                obj.createNewFile();
                System.out.println(obj.length());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
