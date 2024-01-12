public class B38 {
    public static void main(String[] args) {
        String s = "Raj Thakur";
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z')
                System.out.print((char) (c[i] + 32));
            else
                System.out.print(c[i]);
        }
    }
}
