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
                LogsService.logsAmount("D:\\BestBrain\\Java kurs\\logs.txt") +"\n");

        int errorsAmount = 0;

        LocalDateTime startByFiles = LocalDateTime.now();

        errorsAmount = LogsService.errorsAmountByLines("D:\\BestBrain\\Java kurs\\logs.txt");
        LocalDateTime finishByFiles = LocalDateTime.now();
        System.out.println("Time of Files.lines work is " + ChronoUnit.MILLIS.between(startByFiles, finishByFiles) + "ms");
        System.out.println("Amount errors by Files method is " + errorsAmount +"\n");


        LocalDateTime startBySplit = LocalDateTime.now();
        errorsAmount = LogsService.errorsAmountByLines("D:\\BestBrain\\Java kurs\\logs.txt");

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


        -------------------------The OUTPUT------------------------------------

        The amount of all logs is 2845607

        Time of Files.lines work is 13051ms
        Amount errors by Files method is 361

        Time of Split method work is 15590ms
        Amount errors by Files method is 361

        The Files.lines method is faster
        */

    }
}