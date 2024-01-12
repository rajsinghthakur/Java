public class B40 {
    public static void main(String[] args) {
        String s = "My Name Is Raj Thakur";
        char ch[] = s.toCharArray();
        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(ch[i])) {
                uppercase++;
            } else if (Character.isLowerCase(ch[i])) {
                lowercase++;
            }
        }
        System.out.println(uppercase);
        System.out.println(lowercase);
    }
}
