package Lesson28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Main {

    private final static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    private final static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 1, 1, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 2, 3, 9, 0);
        smena(ldt1, ldt2, Period.ofDays(1), Duration.ofHours(8));
    }

    public static void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt1.isBefore(ldt2)) {
            System.out.print("Работаем с: " + ldt1.format(dtf1));
            ldt1 = ldt1.plus(p);
            System.out.println(" До: " + ldt1.format(dtf1));
            System.out.print("Отдыхаем с: " + ldt1.format(dtf2));
            ldt1 = ldt1.plus(d);
            System.out.println(" До: " + ldt1.format(dtf2));
        }
    }
}
