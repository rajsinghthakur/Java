package Loops.assignment2;

public class L59 {
    public static void main(String[] args) {
        int start = 100;
        int end = 200;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 9 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of integers between " + start + " and " + end + " divisible by 9: " + sum);
    }
}
