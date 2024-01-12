class Table extends Thread {
    public void run() {
        try {
            int i;
            for (i = 1; i <= 5; i++) {
                for (int j = 0; j < i; j++) {
                    Thread.sleep(1000);
                    System.out.print((char) i + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Alphabate extends Thread {
    public void run() {
        try {
            int i;
            for (i = 1; i <= 5; i++) {
                for (int j = 0; j < i; j++) {
                    Thread.sleep(1000);
                    System.out.print((char) i + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class M4 {
    public static void main(String args[]) {
        Table obj1 = new Table();
        Alphabate obj2 = new Alphabate();

        obj1.start();
        obj2.start();
    }
}
