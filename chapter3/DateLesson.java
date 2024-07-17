package chapter3;

import java.time.*;

public class DateLesson {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalTime time1 = LocalTime.now();
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(date1);
        System.out.println(time1);
        System.out.println(ldt1);
        LocalDate date2 = LocalDate.of(2012, 12, 2);
        LocalDate date2enum = LocalDate.of(2012, Month.FEBRUARY, 2);
        LocalTime time2 = LocalTime.of(15, 0, 0,90);
        LocalDateTime ldt2= LocalDateTime.of(2021, 2, 28, 12, 0, 0,20);        
        LocalDateTime ldt3 = LocalDateTime.of(date2,time2);
        System.out.println(date2);
        System.out.println(time2);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(date2enum);
        //LocalDate - plusDays, plusMonths,plusWeeks,plusYears
        // minusDays, minusMonths,minusWeeks,minusYears
        System.out.println(date1.plusWeeks(1));
        //LocalTime -minus/ plusHours,plusMinutes,plusSeconds,plusNanos
        System.out.println(time1.plusNanos(30000));
        //LocalDateTime - plusDays, plusMonths,plusWeeks,plusYears
        // minusDays, minusMonths,minusWeeks,minusYears
        // -minus/ plusHours,plusMinutes,plusSeconds,plusNanos
        
    }
}
