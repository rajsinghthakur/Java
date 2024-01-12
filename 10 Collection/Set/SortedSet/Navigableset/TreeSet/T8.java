import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Person pe) {
        return this.id - pe.id;
    }

    public String toString() {
        return id + " " + name + " ";
    }
}

class Comparable4 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<Person>();
        ts.add(new Person(3, "Pratik"));
        ts.add(new Person(1, "Priyanshi"));
        ts.add(new Person(2, "Sourabh"));

        for (Person person : ts) {
            System.out.println(person);
        }
    }
}
