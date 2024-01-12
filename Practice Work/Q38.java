class A {
    public void m1(Object o) {
        System.out.println("Object : " + o);
    }
}

class B extends A {
    public void m1(String s) {
        System.out.println("String : " + s);
    }
}

public class Q38 {
    public static void main(String[] args) {
        A obj = new B();
        obj.m1("raj");
    }
}
