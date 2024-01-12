public class B32 {
    public static void main(String[] args) {
        String s = "Aashish ajmera";
        System.out.println("Orignal String : " + s);
        char c[] = s.toCharArray();
        String s2 = "", s3 = "";
        for (int i = c.length - 1; i >= 0; i--) {
            int count = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (c[i] == c[j]) {
                    count++;
                }
            }
            if (count == 0) {
                s2 = s2 + c[i];
            }
        }
        char c2[] = s2.toCharArray();

        for (int i = c2.length - 1; i >= 0; i--) {
            s3 = s3 + c2[i];
        }
        System.out.print("\nAfter removing duplicates : " + s3);

    }
}
