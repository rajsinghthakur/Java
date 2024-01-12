public class B22 {
    public static void main(String[] args) {
        String s = "raj thakur";
        char c[] = s.toCharArray();
        int count = 1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                count++;
            }
        }
        System.out.println(count);
        String s1[] = new String[count];
        for (int i = 0; i < s1.length; i++) {
        }
    }
}
