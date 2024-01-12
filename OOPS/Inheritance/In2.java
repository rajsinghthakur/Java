class Area2 {
    private int l;
    private int w;

    public Area2(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public int getArea() {
        return l * w;
    }
}

class Volume2 extends Area2 {
    private int h;

    public Volume2(int l, int w, int h) {
        super(l, w);
        this.h = h;
    }

    public int getVolume() {
        return h * getArea();
    }
}

class Dencity extends Volume2 {
    private float m;

    public Dencity(int l, int w, int h, float m) {
        super(l, w, h);
        this.m = m;
    }

    public float getDencity() {
        return (m / getVolume());
    }
}

public class In2 {
    public static void main(String[] args) {
        Dencity obj = new Dencity(2, 3, 4, 15f);
        System.out.println("Area    : " + obj.getArea());
        System.out.println("Volume  : " + obj.getVolume());
        System.out.println("Dencity : " + obj.getDencity());
    }
}
