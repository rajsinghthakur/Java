import java.util.Scanner;

public class Character9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  single character : ");
        char c = sc.next().charAt(0);

        if ((c >= 'A') && (c <= 'Z'))
            System.out.println("character is uppercase");
        else {
            if ((c >= 'a') && (c <= 'z'))
                System.out.println("character is lowercase");
            else
                System.out.println("character is not match");
        }
    }

}
