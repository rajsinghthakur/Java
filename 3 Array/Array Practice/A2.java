public class A2 {
    public static void main(String[] args) {
        int a[] = { 2, 3, 5, 3, 2, 47, 8, 9, 10 };
        int max = 0;
        int min = a[0];
        System.out.print("Array is : [ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("]\nmaximum : " + max);
        System.out.println("minimum : " + min);
    }
}
