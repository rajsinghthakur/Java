import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class IOStream {
    File f = new File("C:/Users/rajth/OneDrive/Desktop/FileHandling.txt");

    public void InputStream() {
        try {
            FileInputStream fis = new FileInputStream(f);
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("\nSomthing want rong\n");
        }
    }

    public void OutputStream() {
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enterr somthig to write the file");
            String s = "\n" + sc.nextLine();
            byte b[] = s.getBytes();
            fos.write(b);
            System.out.println("Successful write in the file\n");
        } catch (Exception e) {
            System.out.println("\nSomthing want rong\n");
        }
    }
}

public class AS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IOStream obj = new IOStream();
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Press-1 To Read the data in the file");
                System.out.println("Press-2 To Write the data in the file");
                System.out.println("Press-3 Exit");
                byte b = sc.nextByte();
                if (b == 1 || b == 2 || b == 3) {
                    switch (b) {
                        case 1:
                            obj.InputStream();
                            break;

                        case 2:
                            obj.OutputStream();
                            break;

                        case 3:
                            flag = false;
                            break;

                        default:
                            break;
                    }
                } else {
                    System.out.println("Invelid input plese re enter\n");
                }
            } catch (Exception e) {
                System.out.println("\nSomthing want rong\n");
                sc.nextLine();
            }
        }
    }
}
