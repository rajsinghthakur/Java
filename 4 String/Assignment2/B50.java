import java.util.StringTokenizer;

public class B50 {
    public static void main(String[] args) {
        String input = "Hello, this is a simple example program using StringTokenizer.";

        // Create a StringTokenizer object and specify the delimiter
        StringTokenizer tokenizer = new StringTokenizer(input, " ");

        // Loop through the tokens and print them
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
