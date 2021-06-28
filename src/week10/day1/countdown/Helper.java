package week10.day1.countdown;

public class Helper extends Thread {
    private int minute;
    private int second;

    public Helper(int minute, int second) {
        this.minute = minute;
        this.second = second;
    }

    @Override
    public void run() {
        countdown();
    }

    private void countdown() {
        while (minute >= 0) {
            if (second >= 0) {
                System.out.println(minute + ":" + second);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                second--;
            }
            if (second < 0) {
                minute--;
                second = 59;
            }
        }
    }
}
