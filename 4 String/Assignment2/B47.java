public class B47 {
    public static void main(String[] args) {
        char c[] = { 'r', 'a', 'j', ' ', 't', 'h', 'a', 'k', 'u', 'r' };
        String s = "";
        for (int i = 0; i < c.length; i++) {
            s = s + c[i];
        }
        System.out.println(s);
        String str2 = String.valueOf(c);
        System.out.println("Converted String 2: " + str2);
    }
}
