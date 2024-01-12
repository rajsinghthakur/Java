
class t1 {
    String name;

    public void test(String name) {
        this.name = name;
        System.out.println("Concatenated String : " + name);
    }

    public String msg() {
        return name;
    }
}

public class B1 {
    public static void main(String[] args) {
        String s1 = "Info";
        String s2 = "beans";
        String s3 = s1 + s2;
        t1 obj = new t1();
        obj.test(s3);
    }
}