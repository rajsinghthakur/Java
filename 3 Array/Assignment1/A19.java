package Array.Assignment1;
import java.util.Scanner;
public class A19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[] =new int[10];
        int sum=0;
        for( int i=1;i<=10;i++){
            System.out.println("Enter Number");
            a[i]= sc.nextInt();
            sum = sum +a[i];
        }
         System.out.println(sum);
        

    }
}
