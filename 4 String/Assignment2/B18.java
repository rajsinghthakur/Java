public class B18 {
    public static void main(String[] args) {
        String s = "raj thakur";
        char c[] = s.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            count++;
        }
        System.out.print("Length of String is : " + count);
    }
}
