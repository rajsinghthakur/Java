package Array.Assignment1;

/*Write a Java program to find duplicate values in an array of string values. */

public class A17 {
    public static void main(String[] args) {
        String a[] = { "Apple", "Orange", "Mango", "Apple", "Banana" };
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i] + " is a duplicate at " + j);
                }
            }
        }
    }
}
