/*Check for Majority Element in a sorted array */
package Array.Assignment2;

public class a10 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 3, 4, 2, 3, 6 };
        int count = 0;
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
            }
        }
        if (count >= n / 2) {
            System.out.println(n);
        }
    }
}
