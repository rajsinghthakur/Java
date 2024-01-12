class Faculty {
    private int faculty;
    private int salary;

    Faculty(int faculty, int salary) {
        this.faculty = faculty;
        this.salary = salary;
    }

    public void getslary() {
        System.out.println("Faculty   : " + faculty);
        System.out.println("Salary    : " + salary);
    }
}

class FullTimeFaculty extends Faculty {
    private int basic;
    private int allowance;

    FullTimeFaculty(int faculty, int basic, int allowance) {
        super(faculty, basic + allowance);
        this.basic = basic;
        this.allowance = allowance;
    }

    public void show1() {
        super.getslary();
        System.out.println("basic     : " + basic + "\nallowance : " + allowance);
        System.out.println();
    }
}

class PartTimeFaculty extends Faculty {
    private int hour;
    private int rate;

    PartTimeFaculty(int faculty, int hour, int rate) {
        super(faculty, hour * rate);
        this.hour = hour;
        this.rate = rate;
    }

    public void show2() {
        super.getslary();
        System.out.println("hour      : " + hour + "\nrate      : " + rate);
        System.out.println();
    }
}

public class Inh7 {
    public static void main(String[] args) {
        FullTimeFaculty obj1 = new FullTimeFaculty(1, 10000, 3000);
        FullTimeFaculty obj2 = new FullTimeFaculty(2, 12000, 2500);
        PartTimeFaculty obj3 = new PartTimeFaculty(3, 3, 1000);
        PartTimeFaculty obj4 = new PartTimeFaculty(4, 4, 1000);
        System.out.println("--------------------");
        System.out.println("FullTimeFaculty");
        System.out.println("--------------------");
        obj1.show1();
        obj2.show1();
        System.out.println("--------------------");
        System.out.println("PartTimeFaculty");
        System.out.println("--------------------");
        obj3.show2();
        obj4.show2();
    }
}
