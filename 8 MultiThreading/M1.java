class Red extends Thread {
    private String red = "\u001B[41m", reset = "\u001B[0m";

    public void run() {
        for (int i = 1; i <= 5; i++) {

            try {
                System.out.print(red + "   " + reset + " ");
                Thread.sleep(0);

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Yello extends Thread {
    private String yello = "\u001B[43m", reset = "\u001B[0m";

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.print(yello + "   " + reset + " ");
                Thread.sleep(0);

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Green extends Thread {
    private String green = "\u001B[42m", reset = "\u001B[0m";

    public void run() {
        for (int i = 1; i <= 5; i++) {

            try {
                System.out.print(green + "   " + reset + " ");
                Thread.sleep(0);

            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class M1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            try {
                Red t1 = new Red();
                Yello t2 = new Yello();
                Green t3 = new Green();

                t1.start();
                t1.join();

                t2.start();
                t2.join();

                t3.start();
                t3.join();

            } catch (Exception e) {
                System.out.println("Somthing error");
            }
        }
    }
}
