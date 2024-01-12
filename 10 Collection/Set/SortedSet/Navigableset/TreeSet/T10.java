import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person pe) {
        return this.age - pe.age;
    }

    public String toString() {
        return name + " " + age + " ";
    }
}

class Comparable1 {
    public static void main(String[] args) {
        List<Person> li = new ArrayList<Person>();
        li.add(new Person("A", 30));
        li.add(new Person("C", 25));
        li.add(new Person("B", 35));

        Collections.sort(li);

        for (Person person : li) {
            System.out.println(person);
        }
    }
}