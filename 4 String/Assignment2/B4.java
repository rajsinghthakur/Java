public class B4 {
    public static void main(String[] args) {
        String s = "raj thak";
        int startIndex = 0;
        int endIndex = 8;
        int count = 0;

        for (int i = startIndex; i < endIndex && i < s.length();) {
            int codePoint = s.codePointAt(i);
            count++;

            i += Character.charCount(codePoint);
        }

        System.out.println("Number of Unicode code points in the specified range: " + count);
    }
}
