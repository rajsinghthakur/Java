class Employee {
    String name;
    int year;
    String Add;

    public Employee(String name, int year, String Add) {
        this.name = name;
        this.year = year;
        this.Add = Add;

    }

    void print() {
        System.out.println(name + "\t" + year + "\t" + Add);
    }
}

public class Q9 {
    public static void main(String[] args) {
        String a[] = { "64C-Wallstreet", "68D-Wallstreet", "26B-Wallstreet" };
        Employee e1 = new Employee("Ashish", 1994, "64C-Wallstreet");
        Employee e2 = new Employee("Sam", 2000, "68D-Wallstreet");
        Employee e3 = new Employee("John", 1999, "26B-Wallstreet");
        Employee e[] = { e1, e2, e3 };
        System.out.println("Name" + "\t" + "year of joining" + "\t" + "Address");
        for (int i = 0; i <= e.length; i++) {
            e[i].print();
        }
    }
}
