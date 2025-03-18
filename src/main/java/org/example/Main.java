package org.example;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fLocalDateDashed = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = "2025-02-06";

        LocalDate localDateStart = LocalDate.parse(date, fLocalDateDashed);
        long time = Timestamp.valueOf(LocalDateTime.of(localDateStart, LocalTime.MIN)).getTime();

        LocalDate localDateEnd = LocalDate.parse(date, fLocalDateDashed);
        long time1 = Timestamp.valueOf(LocalDateTime.of(localDateEnd, LocalTime.MAX)).getTime();

        System.out.println();
    }
}