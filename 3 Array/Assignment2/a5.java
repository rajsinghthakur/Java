/*Write a Java program to test two arrays' equality */
package Array.Assignment2;

public class a5 {
    /*
     * public static void main(String[] args) {
     * int a[] = { 1, 2, 3, 4, 5, 6 };
     * int b[] = { 6, 5, 4, 3, 2, 1 };
     * for (int i = 0; i < a.length; i++) {
     * for (int j = 0; j < a.length; j++) {
     * if (a[i] == b[j])
     * System.out.println("Both array are equal :");
     * else
     * System.out.println("Both array are not equal :");
     * }
     * }
     */

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 1, 2, 3, 4, 5 };
        int[] array3 = { 1, 2, 3, 4, 6 };
        int[] array4 = { 1, 2, 3, 4, 5, 6 };

        System.out.println("Array1 and Array2 are equal: " + areArraysEqual(array1, array2));
        System.out.println("Array1 and Array3 are equal: " + areArraysEqual(array1, array3));
        System.out.println("Array1 and Array4 are equal: " + areArraysEqual(array1, array4));
    }
}
