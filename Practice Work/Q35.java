public class Q35 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = s1;
        String s4 = "ab";
        String s5 = s1 + s2;
        String s6 = s1 + "b";
        String s7 = "a" + s2;

        String s8 = "a".intern();
        StringBuffer s9 = new StringBuffer("A");
        s9 = new StringBuffer("B");
        StringBuffer s10 = new StringBuffer("B");
        // System.out.println(s9);
        // System.out.println(s10);
        // System.out.println(s9 == s10);

        Integer x = 20;
        Integer y = 20;
        System.out.println(x == 20);

    }
}
