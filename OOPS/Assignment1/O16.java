import java.util.Scanner;

class Person {
    private int age;
    private String name;

    public void test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void result() {
        System.out.println("Person name is : " + name + "\nand age is : " + age);
    }
}

public class O16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of person : ");
        String name = sc.nextLine();
        System.out.print("Enter the age of person : ");
        int age = sc.nextInt();
        Person obj = new Person();
        obj.test(name, age);
        obj.result();
    }
}
