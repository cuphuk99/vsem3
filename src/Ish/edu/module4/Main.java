package Ish.edu.module4;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class Main
 * @since 09.04.2021 - 18.30
 */

public class Main {

    public static void main(String[] args) throws IOException {

        LocalDateTime start = LocalDateTime.now();
        System.out.println("Number of logs for a 14.02.2020 - " +
                LogsService.logsByDate("D:\\BestBrain\\Java kurs\\logs.txt",
                LocalDate.of(2020, 02, 14)).size());
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Done in " + ChronoUnit.MILLIS.between(start, finish) + "ms");

        start = LocalDateTime.now();
        LogsService.logsByDateToFile("D:\\BestBrain\\Java kurs\\logs.txt",
                LocalDate.of(2020, 02, 14));
        finish = LocalDateTime.now();
        System.out.println("Done in " + ChronoUnit.MILLIS.between(start, finish) + "ms");


    }
}