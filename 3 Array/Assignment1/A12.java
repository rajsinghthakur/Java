package Array.Assignment1;
/*Q-12. a) Write a statement that declares a string array initialized with the
following strings: "Sunday". "Monday", "Tuesday", "Wednesday". "Thursday". "Friday" and "Saturday". b) Write a loop that displays the contents of each element in the array that you
declared. */
public class A12 {
    public static void main(String[] args) {
        String day[] = { "Monday", "Tueasday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        for (int i = 0; i < 7; i++) {
            System.out.print(day[i]+" ");
        }
    }
}
