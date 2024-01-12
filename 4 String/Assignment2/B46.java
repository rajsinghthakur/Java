public class B46 {
    public static void main(String[] args) {
        String s = "raj thakur is great";
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                result.append(firstChar).append(restOfWord).append(" ");
            }
        }

        String capitalizedString = result.toString().trim();
        System.out.println(capitalizedString);
    }
}
