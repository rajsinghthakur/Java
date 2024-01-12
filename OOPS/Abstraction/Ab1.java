 abstract class A {
    abstract public void get();
}

class B extends A {
    public void get() {
        System.out.println("Hii");
    }
}

public class Ab1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.get();
    }
}