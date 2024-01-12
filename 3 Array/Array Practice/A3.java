public class A3 {
    public static void main(String[] args) {
        int a[] = { 2, 3, 5, 3, 2, 47, 8, 9, 10 };
        int temp = 0;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.print("reverse array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
