import java.util.Comparator;
import java.util.TreeSet;

class Customer {
    private int id;
    private String name;
    private int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + age + " ";
    }
}

class SortById implements Comparator<Customer> {
    public int compare(Customer c1, Customer c2) {
        return c1.getId() - c2.getId();
    }
}

class Comparator1 {
    public static void main(String[] args) {
        TreeSet<Customer> ts = new TreeSet<Customer>(new SortById());
        ts.add(new Customer(21, "A", 32));
        ts.add(new Customer(4, "B", 12));
        ts.add(new Customer(2, "C", 34));

        for (Customer customer : ts) {
            System.out.println(customer);
        }
    }
}
