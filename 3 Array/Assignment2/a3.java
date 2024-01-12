/*Write a program for Swapping Two Arrays */
package Array.Assignment2;

public class a3 {
    public static void main(String[] args) {
        int a[] = { 3, 2, 1, 4, 6, 5 };
        int b[] = { 8, 4, 6, 3, 2, 1 };
        for (int i = 0; i < a.length; i++) {
            int swap = a[i];
            a[i] = b[i];
            b[i] = swap;
        }
        System.out.println("After Swapping");
        System.out.print("1st array is: ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
        
        System.out.println();
        System.out.println("After Swapping");
        System.out.print("2nd array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
