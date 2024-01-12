import java.util.Scanner;
public class Dmart2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Customer Name : ");
    String name = sc.nextLine();
    System.out.print("Enter Date : ");
    String date = sc.nextLine();
    System.out.print("Enter Gender m or f: ");
    char gender = sc.next().charAt(0);
    System.out.print("Enter the Items number : ");
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
      System.out.print("Item no." + (i + 1) + " : ");
      a[i] = sc.nextInt();}
    System.out.println("Enter the Item Quantity : ");
    int b[] = new int[n];
    for (int i = 0; i < b.length; i++) {
      System.out.print("Quantity of Item no." + (i + 1) + " : ");
      b[i] = sc.nextInt();}
    int p[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };int t1 = p[0] * b[0];int t2 = p[1] * b[1];int t3 = p[2] * b[2];int t4 = p[3] * b[3];int t5 = p[4] * b[4]; int t6 = p[5] * b[5];int t7 = p[6] * b[6]; int t8 = p[7] * b[7];int t9 = p[8] * b[8];int t10 = p[9] * b[9];
    double a1 = (t1 * 5) / 100;
    double a5 = (t5 * 10) / 100;
    double a10 = (t10 * 15) / 100;
    double d1 = (b[0] >= 4) ? (t1 - a1) : t1;
    double d2 = t2;
    double d3 = t3;
    double d4 = t4;
    double d5 = (t5 - a5);
    double d6 = t6;
    double d7 = t7;
    double d8 = t8;
    double d9 = t9;
    double d10 = (t10 - a10);
    int ap = (t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10);
    double dp = (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
    String gift = (gender == 'm') ? "Leadger wallet" : (gender == 'f') ? "Cadeberry" : "Sorry";
    System.out.println();
    System.out.print("Do you want a carry bag y or n: ");
    char bag = sc.next().charAt(0);
    String carrybag = (bag == 'y') ? "Yes" : (bag == 'n') ? "No" : "sorry";
    double cb = (bag == 'y') ? (10.00) : (0.00);
    double gst = (ap * 5) / 100;
    double total = (ap + cb + gst);
    double td = (dp + cb + gst);
    System.out.println("\n\n");
    System.out.println("                            D-Mart                          ");
    System.out.println("Name : " + name + "                            " + "Date : " + date);
    System.out.println("-------------------------------------------------------------");
    System.out.println("Item Name     " + "Quantity     " + "Price     " + "Total     " + "After-Discount");
    System.out.println("Item-" + a[0] + "\t\t  " + b[0] + "\t    " + p[0] + "    \t" + t1 + "      \t" + d1);
    System.out.println("Item-" + a[1] + "\t\t  " + b[1] + "\t    " + p[1] + "    \t" + t2 + "      \t" + d2);
    System.out.println("Item-" + a[2] + "\t\t  " + b[2] + "\t    " + p[2] + "    \t" + t3 + "      \t" + d3);
    System.out.println("Item-" + a[3] + "\t\t  " + b[3] + "\t    " + p[3] + "    \t" + t4 + "      \t" + d4);
    System.out.println("Item-" + a[4] + "\t\t  " + b[4] + "\t    " + p[4] + "    \t" + t5 + "      \t" + d5);
    System.out.println("Item-" + a[5] + "\t\t  " + b[5] + "\t    " + p[5] + "    \t" + t6 + "      \t" + d6);
    System.out.println("Item-" + a[6] + "\t\t  " + b[6] + "\t    " + p[6] + "    \t" + t7 + "      \t" + d7);
    System.out.println("Item-" + a[7] + "\t\t  " + b[7] + "\t    " + p[7] + "    \t" + t8 + "      \t" + d8);
    System.out.println("Item-" + a[8] + "\t\t  " + b[8] + "\t    " + p[8] + "    \t" + t9 + "      \t" + d9);
    System.out.println("Item-" + a[9] + "\t\t  " + b[9] + "\t    " + p[9] + "    \t" + t10 + "      \t" + d10);
    System.out.println("-------------------------------------------------------------");
    System.out.println("                                      " + "A.P           " + "D.P");
    System.out.println("                                      " + ap + "          " + dp);
    System.out.println("Gift : " + gift + "                      0.00      " + "    0.00");
    System.out.println("Carry Bag : " + carrybag + "                         " + cb + "           " + cb);
    System.out.println("GST (10%)" + "                             " + gst + "         " + gst);
    System.out.println("-------------------------------------------------------------");
    System.out.println("                                       " + total + "          " + td);
    System.out.println("                          Thank You                         ");
    System.out.println("                           To Vist                          ");
    System.out.println("                            D-Mart                          ");
    System.out.println("-------------------------------------------------------------");
  }
}
// D-Mart
// Name : Cheeku Sing Date: 12/9/2022
// -----------------------------------------------------------
// Item Name Quantity Price Total After-Discount
// Item-1 5 10 50 Rs 47.5 Rs
// Item-2 3 20 60 RS 60.0 RS
// .
// .
// .
// .
// .
// .
// .
// Item-10 20 100 2000 300.0 Rs
// ----------------------------------------------------------
// A.P D.P
// 45000 43500
// Gift :- Cadeberry 0.00 0.00
//
// Carry Bag : yes 10:00 10:00
// GST (10%) 450 450
// ---------------------------------------------------------
// 45460 43960 RS
//
// Thank You
// To Vist
// D-Mart

// ----------------------------------------------------------