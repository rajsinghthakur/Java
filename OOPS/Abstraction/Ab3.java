abstract class A {
    private int l;
    private int w;

    public A(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public int getl() {
        return l;
    }

    public int getw() {
        return w;
    }

    abstract public int getArea();
}

abstract class B extends A {
    public B(int l, int w) {
        super(l, w);

    }

    public int getArea() {
        return getl() * getw();
    }
}

abstract class C extends A {
    public C(int l, int w) {
        super(l, w);

    }

    public int getVolume() {
        return getl() * getw();
    }
}

public class Ab3 {
    public static void main(String[] args) {
        C obj = new C(2, 4);
        System.out.println(obj.getArea());
    }
}
