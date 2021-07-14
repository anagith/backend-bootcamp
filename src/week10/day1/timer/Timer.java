package week10.day1.timer;

public class Timer extends Thread {
    private TYPE type;

    public Timer(TYPE type) {
        this.type = type;
    }

    @Override
    public void run() {
        try {
            timer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void timer() throws InterruptedException {
        if (type.equals(TYPE.SECONDS)) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                sleep(1000);

            }
        } else if (type.equals(TYPE.MILLIS)) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                sleep(1);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                sleep(0, 1);
            }
        }
    }
}
