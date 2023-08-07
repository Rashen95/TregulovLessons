package Lesson15;

public class Time {
    public static void main(String[] args) {
        showWatch();
    }


    public static void showWatch() {
        int hour = 0;
        HOUR:
        while (hour < 6) {
            int minutes = -1;
            MINUTES:
            do {
                minutes++;
                if (hour > 1 && minutes % 10 == 0) {
                    break HOUR;
                }
                int seconds = 0;
                while (seconds < 60) {
                    if (seconds * hour > minutes) {
                        continue MINUTES;
                    }
                    System.out.println(hour + ":" + minutes + ":" + seconds);
                    seconds++;
                }
            }
            while (minutes < 59);
            hour++;
        }
    }
}
