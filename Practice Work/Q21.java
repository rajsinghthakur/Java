
class Teacher {
    String name;
    String qualification;

    public Teacher(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public void fgh() {

    }
}

class Department extends Teacher {
    String departNo;
    String deptName;

    public Department(String name, String qualification, String departNo, String deptName) {
        super(name, qualification);
        this.departNo = departNo;
        this.deptName = deptName;
    }

    public void display() {
        System.out.println(name);
        System.out.println(qualification);
        System.out.println(departNo);
        System.out.println(deptName);
    }
}

public class Q21 {
    public static void main(String[] args) {
        Department obj = new Department("name", "M-Tech", "IT-121", "Information Tecnology");
        obj.display();
    }
}
