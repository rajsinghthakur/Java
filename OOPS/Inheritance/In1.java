class Area1 {
    private int l;
    private int w;

    public void setdata(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public int getArea() {
        return l * w;
    }
}

class Volume1 extends Area1 {
    private int h;

    public void setdata(int l, int w, int h) {
        setdata(l, w);
        this.h = h;
    }

    public int getVolume() {
        return h * getArea();
    }
}

class in1 {
    public static void main(String[] args) {
        Volume1 obj = new Volume1();
        obj.setdata(1, 2, 3);
        System.out.println(obj.getArea());
        System.out.println(obj.getVolume());

    }
}