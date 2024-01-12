public class B41 {
    public static void main(String[] args) {
        String s = "    raj thakur    ";
        char c[] = s.toCharArray();
        char sp = s.charAt(0);
        int i;
        for (i = 0; i < c.length; i++) {
            if (c[i] == sp) {
                System.out.print("");
            } else
                System.out.print(c[i]);
        }
    }
}