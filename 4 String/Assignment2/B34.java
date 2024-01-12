class B34 {
    public static void main(String[] args) {
        String s = "raj thakur";
        String a[] = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            String reverse = " ";
            for (int j = 0; j < a[i].length(); j++) {
                char ch = a[i].charAt(j);
                reverse = ch + reverse;
            }
            System.out.print(reverse);
        }
    }
}