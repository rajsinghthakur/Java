public class B24 {
    public static void main(String[] args) {
        String s = "raj thakur";
        String s1 = "";
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < 2; j++) {
                s1 = s1 + c[i];
            }
        }
        System.out.print(s1);
    }
}
