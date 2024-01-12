/*Find a missing number in an array  */
package Array.Assignment2;

import java.util.Arrays;

public class a6 {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // The expected length of the array with the missing number
        int totalSum = n * (n + 1) / 2; // The sum of all elements if no numbers were missing

        int actualSum = Arrays.stream(arr).sum(); // The actual sum of elements in the array
        return totalSum - actualSum; // The missing number
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 6, 7, 8 };
        int missingNumber = findMissingNumber(array1);
        System.out.println("The missing number is: " + missingNumber);
    }
}
