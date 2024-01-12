public class M2 {
    public static void main(String args[]) {
        String s4 = "infobeans";
        char c[] = s4.toCharArray();
        for (char a : c) {
            if (c >= 'A' && c <= 'Z')
                System.out.println(a);
        }
    }
}
