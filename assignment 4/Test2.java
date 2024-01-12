
import java.util.Scanner;

class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the iteam name : ");
        String i  = sc.nextLine();

        System.out.print("Enter the quantity : ");
        int q = sc.nextInt();

        int price = 100;
        int value = q*price;  

        double d=(value*10)/100f;
        double discount = value-d;

        System.out.println("Total amount : "+value+" Rs");

        if (value>=1000) {
            System.out.println("After-discount 10% : "+discount+" Rs");
        } 
    }
}
