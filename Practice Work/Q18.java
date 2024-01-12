public class Q18 {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        int total;
        while (number != 0) {
            number = number % 10;
            sum = sum + number;
             number = number / 10;
        }
        System.out.println(sum);
        System.out.println(number);
    }
}
