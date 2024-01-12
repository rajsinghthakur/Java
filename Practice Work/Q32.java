class A {
    static {
        System.out.println("sp1");
    }

    A() {
        System.out.println("cp1");
    }

    static {
        System.out.println("sp2");
    }
    {
        System.out.println("ip1");
    }
}

class B extends A {
    static {
        System.out.println("sc1");
    }

    {
        System.out.println("ic1");
    }

    public B() {
        System.out.println("cc1");
    }

    static {
        System.out.println("sc2");
    }

}

public class Q32 {

    public static void main(String[] args) {
        B obj = new B();
    }
}
