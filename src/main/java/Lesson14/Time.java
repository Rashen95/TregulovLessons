package Lesson14;

public class Time {
    public static void main(String[] args) {
        showWatch();
    }

    public static void showWatch() {
        HOUR:
        for (int hour = 0; hour < 6; hour++) {
            MINUTES:
            for (int minutes = 0; minutes < 60; minutes++) {
                if (hour > 1 && minutes % 10 == 0) {
                    break HOUR;
                }
                for (int seconds = 0; seconds < 60; seconds++) {
                    if (seconds * hour > minutes) {
                        continue MINUTES;
                    }
                    System.out.println(hour + ":" + minutes + ":" + seconds);
                }
            }
        }
    }
}
