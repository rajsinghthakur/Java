import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee emp) {
        return this.name.compareTo(emp.name);
    }

    public String toString() {
        return id + " " + name + " " + salary + " ";
    }
}

class Comparable5 {
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<Employee>();
        ts.add(new Employee(1331, "RF", 3324.45f));
        ts.add(new Employee(1421, "NB", 38934.434f));
        ts.add(new Employee(3244, "RT", 3424434.56f));

        for (Employee employee : ts) {
            System.out.println(employee);
        }
    }
}
