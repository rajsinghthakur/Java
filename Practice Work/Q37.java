final class immutable {
    private final String name;
    private final int age;

    public immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

}

public class Q37 {
    public static void main(String[] args) {
        immutable obj = new immutable("raj", 21);

        System.out.println(obj.getname());
        System.out.println(obj.getage());
    }
}
