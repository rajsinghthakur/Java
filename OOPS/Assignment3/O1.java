import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printdata() {
        System.out.println("---------------------\nPrint data\n---------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class O1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age  : ");
        int age = sc.nextInt();
        Person obj = new Person(name, age);
        obj.printdata();
    }
}