package Ish.edu.module4.filesManagement;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class Main
 * @since 10.04.2021 - 15.00
 */

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("The amount of all logs is " +
                LogsService.logsAmount("D:\\BestBrain\\Java kurs\\logs2019.log") +"\n");

        int errorsAmount = 0;

        LocalDateTime startByFiles = LocalDateTime.now();
        errorsAmount = LogsService.errorsAmountByLines("D:\\BestBrain\\Java kurs\\logs2019.log");
        LocalDateTime finishByFiles = LocalDateTime.now();
        System.out.println("Time of Files.lines work is " + ChronoUnit.MILLIS.between(startByFiles, finishByFiles) + "ms");
        System.out.println("Amount errors by Files method is " + errorsAmount +"\n");


        LocalDateTime startBySplit = LocalDateTime.now();
        errorsAmount = LogsService.errorsAmountBySplit("D:\\BestBrain\\Java kurs\\logs2019.log");
        LocalDateTime finishBySplit = LocalDateTime.now();
        System.out.println("Time of Split method work is " + ChronoUnit.MILLIS.between(startBySplit, finishBySplit) + "ms");
        System.out.println("Amount errors by Files method is " + errorsAmount + "\n");

        if (ChronoUnit.MILLIS.between(startBySplit, finishBySplit) <
                ChronoUnit.MILLIS.between(startByFiles, finishByFiles)) {
                    System.out.println("The Split method is faster");
        } else {
                    System.out.println("The Files.lines method is faster");
        }

        /*

        I use the logs2019.log file cause the "out of memory" error

        -------------------------The OUTPUT------------------------------------

        The amount of all logs is 433387

        Time of Files.lines work is 1486ms
        Amount errors by Files method is 105

        Time of Split method work is 1905ms
        Amount errors by Files method is 105

        The Files.lines method is faster
        */

    }
}