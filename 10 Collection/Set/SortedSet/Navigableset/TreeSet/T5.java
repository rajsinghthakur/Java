import java.util.Comparator;
import java.util.TreeSet;

class Students {
    private int rollNo;
    private String studentName;
    private String className;

    public Students(int rollNo, String studentName, String className) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String toString() {
        return rollNo + " " + studentName + " " + className + " ";
    }
}

class sortByClassName implements Comparator<Students> {
    public int compare(Students st1, Students st2) {
        return st1.getClassName().compareTo(st2.getClassName());
    }
}

class Comparator5 {
    public static void main(String[] args) {
        TreeSet<Students> ts = new TreeSet<Students>(new sortByClassName());

        ts.add(new Students(12121, "Pratik", "Class-A"));
        ts.add(new Students(12122, "Sourabh", "Class-C"));
        ts.add(new Students(12123, "Priyanshi", "Class-B"));

        for (Students students : ts) {
            System.out.println(students);
        }
    }
}
