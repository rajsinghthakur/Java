import java.util.Scanner;

public class TestInsert {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product Name");
        String name = sc.next();

        System.out.println("Enter product Price");
        int price = sc.nextInt();

        System.out.println("Enter product Brand");
        String brand = sc.next();

        Product p = new Product(name, price, brand);

        if (ProductDAO.insert(p) != -1)
            System.out.println("Record Insertes.....");
        else
            System.out.println("Record Insertes.....");
    }
}
