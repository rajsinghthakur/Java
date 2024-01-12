public class B45 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("hello");
        System.out.println("== operator : " + (s1 == s2));
        System.out.println("equals() : " + s1.equals(s2));
        System.out.println("compareTo() : " + s1.compareTo(s2));
    }
}
