import java.io.FileOutputStream;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        System.out.println("Enter somthing");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        byte b[] = s.getBytes();
        try {
            FileOutputStream f = new FileOutputStream("C:/Users/rajth/OneDrive/Desktop/FileHandling.txt", true);
            f.write(b);
            f.close();
            System.out.println("successfuly write data in the file");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
