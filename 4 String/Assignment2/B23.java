public class B23 {
    public static void main(String[] args) {
        String s1 = "         java is a simple          ";
        String s2 = "";
        char c1[] = s1.toCharArray();
        int start = 0, end = c1.length;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == ' ') {
                start++;
            } else if (c1[i] >= 'A' && c1[i] <= 'z') {
                break;
            }
        }
        for (int i = c1.length - 1; i >= 0; i--) {
            if (c1[i] == ' ') {
                end--;
            } else if (c1[i] >= 'A' && c1[i] <= 'z') {
                break;
            }
        }
        for (int i = start; i < end; i++) {
            s2 = s2 + c1[i];
        }
        System.out.println("Before Trim white space :" + s1 + "!");
        System.out.println("After  Trim white space :" + s2 + "!");
    }
}
