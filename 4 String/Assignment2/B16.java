public class B16 {
    public static void main(String[] args) {
        String s = "RAJ THAKUR";
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if ('A' <= c[i] && 'Z' >= c[i]) {
                System.out.print((char) ((c[i]) + 32));
            } else
                System.out.print(c[i]);
        }
    }
}
