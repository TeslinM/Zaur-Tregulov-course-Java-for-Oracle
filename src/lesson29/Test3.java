package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014,5,31);
        LocalDate ld2 = LocalDate.of(2012, Month.JUNE,19);

        LocalTime lt1 = LocalTime.of(15,30);
        LocalTime lt2 = LocalTime.of(03,5, 18, 32323);

        LocalDateTime ldt1 = LocalDateTime.of(2015,9,10,17,25);
        LocalDateTime ldt2 = LocalDateTime.of(2014,9,01,00,21);
    }
}
