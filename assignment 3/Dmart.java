import java.util.Scanner;

import javax.naming.MalformedLinkException;

class Dmart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       // System.out.print("Name of Costumer : ");
        //String name = sc.nextLine();

        System.out.print("Enter Gender : ");
        String gender = sc.nextLine();

        /*System.out.print("Enter Date : ");
        String date = sc.nextLine();

        System.out.print("Enter item 1 : ");
        String item1 = sc.nextLine();
        System.out.print("Enter item 2 : ");
        String item2 = sc.nextLine();
        System.out.print("Enter item 3 : ");
        String item3 = sc.nextLine();
        System.out.print("Enter item 4 : ");
        String item4 = sc.nextLine();
        System.out.print("Enter item 5 : ");
        String item5 = sc.nextLine();
        System.out.print("Enter item 6 : ");
        String item6 = sc.nextLine();
        System.out.print("Enter item 7 : ");
        String item7 = sc.nextLine();
        System.out.print("Enter item 8 : ");
        String item8 = sc.nextLine();
        System.out.print("Enter item 9 : ");
        String item9 = sc.nextLine();
        System.out.print("Enter item 10 : ");
        String item10 = sc.nextLine();

        System.out.print("Enter Quntity of item 1: ");
        int q1 = sc.nextInt();
        System.out.print("Enter Quntity of item 2: ");
        int q2 = sc.nextInt();
        System.out.print("Enter Quntity of item 3: ");
        int q3 = sc.nextInt();
        System.out.print("Enter Quntity of item 4: ");
        int q4 = sc.nextInt();
        System.out.print("Enter Quntity of item 5: ");
        int q5 = sc.nextInt();
        System.out.print("Enter Quntity of item 6: ");
        int q6 = sc.nextInt();
        System.out.print("Enter Quntity of item 7: ");
        int q7 = sc.nextInt();
        System.out.print("Enter Quntity of item 8: ");
        int q8 = sc.nextInt();
        System.out.print("Enter Quntity of item 9: ");
        int q9 = sc.nextInt();
        System.out.print("Enter Quntity of item 10: ");
        int q10 = sc.nextInt();

        int p1 = 10;
        int p2 = 20;
        int p3 = 30;
        int p4 = 40;
        int p5 = 50;
        int p6 = 60;
        int p7 = 70;
        int p8 = 80;
        int p9 = 90;
        int p10 = 100;

        int t1 = q1 * p1;
        int t2 = q2 * p2;
        int t3 = q3 * p3;
        int t4 = q4 * p4;
        int t5 = q5 * p5;
        int t6 = q6 * p6;
        int t7 = q7 * p7;
        int t8 = q8 * p8;
        int t9 = q9 * p9;
        int t10 = q10 * p10;

        double a1 = (t1 * 5) / 100;
        double d1 = (q1 >= 4) ? (t1 - a1) : t1;
        double a5 = (t5 * 10) / 100;
        double d5 = (t5 - a5);
        double a10 = (t10 * 15) / 100;
        double d10 = (t10 - a10);

        System.out.println("\n\n\n");
        System.out.println("\t\t\t     D-mart \t\t\t");
        System.out.println("\n");
        System.out.println("Name : " + name + "\t\t\t\tDate : " + date);
        System.out.println("Gender : " + gender);
        System.out.println(
                "------------------------------------------------------------------------");
        System.out.println("Item Name \t Quantity \t Price \t   Total \t After-Discount");
        System.out.println(item1 + "\t\t    " + q1 + "\t\t  " + p1 + "\t    " + t1 +
                " Rs" + "\t    " + d1 + " Rs");
        System.out.println(item2 + "\t\t    " + q2 + "\t\t  " + p2 + "\t    " + t2 +
                " Rs" + "\t    " + t2 + " Rs");
        System.out.println(item3 + "\t\t    " + q3 + "\t\t  " + p3 + "\t    " + t3 +
                " Rs" + "\t    " + t3 + " Rs");
        System.out.println(item4 + "\t\t    " + q4 + "\t\t  " + p4 + "\t    " + t4 +
                " Rs" + "\t    " + t4 + " Rs");
        System.out.println(item5 + "\t\t    " + q5 + "\t\t  " + p5 + "\t    " + t5 +
                " Rs" + "\t    " + d5 + " Rs");
        System.out.println(item6 + "\t\t    " + q6 + "\t\t  " + p6 + "\t    " + t6 +
                " Rs" + "\t    " + t6 + " Rs");
        System.out.println(item7 + "\t\t    " + q7 + "\t\t  " + p7 + "\t    " + t7 +
                " Rs" + "\t    " + t7 + " Rs");
        System.out.println(item8 + "\t\t    " + q8 + "\t\t  " + p8 + "\t    " + t8 +
                " Rs" + "\t    " + t8 + " Rs");
        System.out.println(item9 + "\t\t    " + q9 + "\t\t  " + p9 + "\t    " + t9 +
                " Rs" + "\t    " + t9 + " Rs");
        System.out.println(item10 + "\t\t    " + q10 + "\t\t " + p10 + "\t    " + t10
                + " Rs" + "\t    " + d10 + " Rs");
        System.out.println(
                "------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tA.P\tD.P");
        int ap = t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10;
        double dp = d1 + t2 + t3 + t4 + d5 + t6 + t7 + t8 + t9 + d10;
        System.out.println("\t\t\t\t\t\t" + ap + "\t" + dp);*/


        if (gender == "female")
            System.out.println("Gift : cadeberry" + "\t\t\t\t0.00\t0.00");
        else{
        if(gender == "male")
            System.out.println("Gift : leadger wallet" + "\t\t\t\t0.00\t0.00");
        }

    }
}
