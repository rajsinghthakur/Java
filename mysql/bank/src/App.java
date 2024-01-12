import java.sql.*;
import java.util.*;

public class App {

    private static final String url = "jdbc:mysql://localhost:3306/shope";
    private static final String username = "root";
    private static final String password = "Raj@882714";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement sta = con.createStatement();
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            boolean flag = true;
            while (flag) {
                System.out.println("\n----------which operation you haveperform----------\n");
                System.out.println("insert\tupdate\tdelete\tread\texit");
                System.out.println(" 1 \t 2 \t 3 \t 4 \t 5 ");
                byte n = sc.nextByte();
                if (n == 1 | n == 2 | n == 3 | n == 4 | n == 5) {
                    switch (n) {

                        case 1:
                            // insert data
                            System.out.print("Enter Product Name : ");
                            String name1 = sc1.nextLine();
                            System.out.print("Enter Price : ");
                            int price1 = sc.nextInt();
                            System.out.print("Enter Product Brand : ");
                            String brand1 = sc1.nextLine();

                            String q1 = String.format("insert into product(Product_name, price, brand)values('" + name1
                                    + "'," + price1 + ",'" + brand1 + "')");
                            int rows1 = sta.executeUpdate(q1);
                            if (rows1 > 0) {
                                System.out.println("data inserted");
                            } else {
                                System.out.println("data not inserted");
                            }
                            break;

                        case 2:
                            // update data
                            System.out.print("Enter id : ");
                            int id2 = sc.nextInt();
                            // System.out.print("Enter name : ");
                            // String name2 = sc1.nextLine();
                            System.out.print("Enter Price : ");
                            int price2 = sc.nextInt();
                            // System.out.print("Enter brand : ");
                            // String brand2 = sc1.nextLine();
                            String q2 = String.format("update product set price = %d where id = %d",
                                    price2, id2);
                            int rows2 = sta.executeUpdate(q2);
                            if (rows2 > 0) {
                                System.out.println("data updated");
                            } else {
                                System.out.println("data not updated");
                            }
                            break;

                        case 3:
                            // delete data
                            System.out.print("Enter id : ");
                            int id3 = sc.nextInt();
                            String q3 = String.format("delete from product where id = %d", id3);
                            int rows3 = sta.executeUpdate(q3);
                            if (rows3 > 0) {
                                System.out.println("data deleted");
                            } else {
                                System.out.println("data not deleted");
                            }
                            break;

                        case 4:
                            // retrive / read data
                            String q4 = "select * from product";
                            ResultSet rest = sta.executeQuery(q4);
                            int id = 0;
                            String name = "";
                            int price = 0;
                            String brand = "";
                            System.out.println("ID PRODUCT_NAME PRICE BRAND");
                            while (rest.next()) {
                                id = rest.getInt("id");
                                name = rest.getString("PRODUCT_NAME");
                                price = rest.getInt("PRICE");
                                brand = rest.getString("BRAND");
                                System.out.println(id + "\t" + name + "\t\t" + price + "\t" + brand);
                            }
                            break;

                        case 5:
                            flag = false;
                            break;
                    }
                } else {
                    System.out.println("invelid input");
                }
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
