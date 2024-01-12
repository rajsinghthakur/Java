import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class IO1 {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:/Users/rajth/OneDrive/Desktop/FileHandling.txt");
            if (myObj.exists()) {
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Writeable: " + myObj.canWrite());
                System.out.println("Readable " + myObj.canRead());
                System.out.println("File size in bytes " + myObj.length());
                long time1 = myObj.lastModified();
                DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
                System.out.println("java modified date is : " + sdf.format(time1));
            } else {
                System.out.println("The file does not exist.");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}