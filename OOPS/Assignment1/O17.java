class Employee {
    int empNo;
    int totalSalary;

    Employee(int a[]) {
        for (int i = 0; i < a.length; i++) {
            empNo++;
            totalSalary = totalSalary + a[i];
        }
    }

    void result() {
        System.out.println("Employee number is : " + empNo + " \nTotal salary is : " + totalSalary);
    }
}

public class O17 {
    public static void main(String[] args) {
        int a[] = { 21000, 25000, 26000, 23000, 29000 };
        Employee obj = new Employee(a);
        obj.result();
    }

}
