package ClassWork;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int pizza = 100;
        int puffs = 20;
        int coldrink = 10;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quentity of Pizzas : ");
        int a = sc.nextInt();
        System.out.print("Enter the quentity of puffs : ");
        int b = sc.nextInt();
        System.out.print("Enter the quentity of coldrink : ");
        int c = sc.nextInt();
        pizza = pizza * a;
        puffs = puffs * b;
        coldrink = coldrink * c;
        System.out.println("pizza " + pizza);
        System.out.println("puffs " + puffs);
        System.out.println("coldrink " + coldrink);
        int t = pizza + puffs + coldrink;
        System.out.println("Total bill is : " + t);
    }
}
