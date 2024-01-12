class DoubleTon {
    private static DoubleTon o1;
    private static DoubleTon o2;

    private DoubleTon() {

    }

    public static DoubleTon geto1() {
        if (o1 == null) {
            o1 = new DoubleTon();
        }
        return o1;
    }

    public static DoubleTon geto2() {
        if (o2 == null) {
            o2 = new DoubleTon();
        }
        return o2;
    }
}

public class Q34 {
    public static void main(String[] args) {

        DoubleTon obj1 = DoubleTon.geto1();
        DoubleTon obj2 = DoubleTon.geto2();
        DoubleTon obj3 = DoubleTon.geto1();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}