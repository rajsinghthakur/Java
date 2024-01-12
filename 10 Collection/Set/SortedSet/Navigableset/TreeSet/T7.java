import java.util.Collections;
import java.util.LinkedList;
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

class Comparable3 {
    public static void main(String[] args) {
        List<Person> ll = new LinkedList<>();
        ll.add(new Person("Pratik", 27));
        ll.add(new Person("Sourabh", 24));
        ll.add(new Person("Priyanshi", 19));

        Collections.sort(ll);
        for (Person person : ll) {
            System.out.println(person);
        }
    }
}
