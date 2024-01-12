public class B25 {
    public static void main(String[] args) {
        String s = "trsg85555552df11j888g";
        char c1[] = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] >= '0' && c1[i] <= '9') {
                sum = sum + ((int) (c1[i] - 48));
            }
        }
        System.out.println(sum);
    }
}
