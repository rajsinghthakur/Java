public class B36 {
    public static void main(String[] args) {
        String input = "121";

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert to lowercase to make it case-insensitive

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// public class B36 {
// public static void main(String[] args) {
// String s = "radar";
// char c[] = s.toCharArray();
// String check1 = "";
// String check2 = "";
// for (int i = 0; i < c.length; i++) {
// check1 = check1 + c[i];
// }
// for (int i = c.length - 1; i >= 0; i--) {
// check2 = check2 + c[i];
// }
// if (check1.equals(check2)) {
// System.out.println(s + " is a palindrome.");
// } else {
// System.out.println(s + " is not a palindrome.");
// }

// }
// }