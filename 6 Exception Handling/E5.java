class InvalidVoterException extends Exception {
    public InvalidVoterException() {
        super("Abhi aap bade he");
    }
}

public class E5 {
    public static void main(String[] args) {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Enter your Age");
            int age = sc.nextInt();

            if (age < 18)
                throw new InvalidVoterException();
            else
                System.out.println("Thanks for voting......");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("At the End........");
    }
}
