public class B29 {
    public static void main(String[] args) {
        String s = "hello world";
        char c[] = s.toCharArray();
        String s1 = "";
        for (int i = c.length - 1; i >= 0; i--) {
            s1 = s1 + c[i];
        }
        System.out.println("reverse string : " + s1);
    }
}
