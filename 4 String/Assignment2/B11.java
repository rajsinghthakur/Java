public class B11 {
    public static void main(String[] args) {
        String s1 = "Hello, World!";
        String s2 = "Hello";

        boolean chek = false;

        int s1Length = s1.length();
        int seqLength = s2.length();

        for (int i = 0; i < seqLength; i++) {
            if (s1.charAt(s1Length - seqLength + i) == s2.charAt(i)) {
                chek = true;
            }
        }

        if (chek) {
            System.out.println("The string ends with the specified sequence.");
        } else {
            System.out.println("The string does not end with the specified sequence.");
        }
    }
}