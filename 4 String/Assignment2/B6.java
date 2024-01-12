
public class B6 {
    public static void main(String[] args) {
        String str1 = "apPewsa m,
        Le";
        String str2 = "Apple";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        boolean s1 = false, s2 = true;
        if (str1.length() == str2.length()) {
            s1 = true;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                s2 = false;
            }
        }

        if (s1 && s2)
            System.out.println("The strings are lexicographically equal.");
        else
            System.out.println("The strings are not lexicographically equal.");

    }
}
