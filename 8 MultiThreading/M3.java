class CalculateSum extends Thread {
    public void run() {
        try {
            System.out.println("calculate sum");
            Thread.sleep(1000);
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum = sum + i;
            }
            System.out.println("Sum : " + sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class M3 {
    public static void main(String[] args) {
        CalculateSum obj = new CalculateSum();
        obj.start();
        obj.threadId();
    }
}
