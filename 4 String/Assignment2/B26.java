public class B26 {
    public static void main(String[] args) {
        String s = "java is simple language";
        String s1[] = s.split("\\s");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            count++;
        }
        System.out.print("Count words in given string is : " + count);
    }
}
