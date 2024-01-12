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

class B extends A {
    public B(int l, int w) {
        super(l, w);

    }

    public int getArea() {
        return getl() * getw();
    }
}

public class Ab2 {
    public static void main(String[] args) {
        B obj = new B(2,3);
        System.out.println(obj.getArea());
    }
}
