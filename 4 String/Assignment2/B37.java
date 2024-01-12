public class B37 {
    public static void main(String[] args) {
        String s = "String Exercises";
        char c[] = s.toCharArray();
        char present = 'S';
        boolean check = false;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == present) {
                check = true;
            }
        }
        if (check) {
            System.out.println(present + " is present in the word 'String Exercises'");
        } else
            System.out.println(present + " is not present in the word 'String Exercises'");
    }
}
