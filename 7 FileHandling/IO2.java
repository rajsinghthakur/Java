import java.io.FileWriter;
import java.util.Scanner;

public class IO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any think to write in the file");
        String s = sc.nextLine();
        try {
            FileWriter myWriter = new FileWriter("C:/Users/rajth/OneDrive/Desktop/FileHandling.txt",true);
            myWriter.write(s + "\n");
            myWriter.close();
            System.out.println("Successfilly wrote to the file. ");
        } catch (Exception e) {
            System.out.println("An error occurred. ");
            e.printStackTrace();
        }
    }
}
