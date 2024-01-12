class Test {
    public static void main(String args[]) {
        String s4 = "InfoBeans Foundation";
        char c[] = s4.toCharArray();
        int count = 0;
        for (int i = 1; i <= c.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}