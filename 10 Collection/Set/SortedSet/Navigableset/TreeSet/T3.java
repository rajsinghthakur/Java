import java.util.Comparator;
import java.util.TreeSet;

class Employee {
    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getId() {
        return empId;
    }

    public String toString() {
        return empId + " " + empName + " " + empSalary + " ";
    }
}

class SortById implements Comparator<Employee> {

    public int compare(Employee emp1, Employee emp2) {
        return emp1.getId() - emp2.getId();
    }
}

class Comparator3 {
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<Employee>(new SortById());

        ts.add(new Employee(3, "fsdnj", 3993));
        ts.add(new Employee(2, "dsjhasd", 389930));
        ts.add(new Employee(4, "efsdkja", 349839));

        for (Employee employee : ts) {
            System.out.println(employee);
        }
    }
}
