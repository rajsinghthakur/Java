class A1 {
    public static void main(String[] args) {
        int a[] = { 2, 3, 5, 3, 2, 47, 8, 9, 10 };
        if (a[0] > a[1])
            System.out.println(a[0] + " is peek element");
        if (a[a.length - 1] > a[a.length - 2])
            System.out.println(a[a.length - 1] + " is peek element");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[i] < a[j] && a[j] > a[j + 1]) {
                    System.out.println(a[j] + " is peek element");
                }
                break;
            }
        }
    }
}