import java.util.Scanner;

class PersonData {
    public String name() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.trim();
        if (name.matches("^[a-z A-Z]+$")) {
            return name;
        } else {
            while (!name.matches("^[a-z A-Z]+$")) {
                System.out.print("Invalid Name plese reenter : ");
                name = sc.nextLine();
            }
            return name;
        }
    }

    public boolean number() {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        if (number <= 9999999999l && number >= 1000000000l) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Invelid number");
            return false;
        }
    }
}

public class Q39 {
    public static void main(final String[] args) {
        PersonData obj = new PersonData();
        System.out.print("Enter a name: ");
        System.out.println(obj.name());
        // System.out.print("Enter number : ");
        // System.out.println(obj.number());

    }
}
