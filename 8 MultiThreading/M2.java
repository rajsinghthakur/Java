class First extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class M2 {
    public static void main(String[] args) {
        First t1 = new First();
        First t2 = new First();

        t1.setName("T1");
        ;
        t2.setName("T2");
        ;

        t1.start();
        t2.start();

    }
}
