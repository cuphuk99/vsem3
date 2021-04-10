package Ish.edu.module4;

import java.io.IOException;
import java.time.LocalDate;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class Main
 * @since 09.04.2021 - 18.30
 */

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(LogsService.logsByDate("D:\\BestBrain\\Java kurs\\logs.txt",
                LocalDate.of(2020, 02, 14)).size());

        LogsService.logsByDateToFile("D:\\BestBrain\\Java kurs\\logs.txt",
                LocalDate.of(2020, 02, 14));

    }
}