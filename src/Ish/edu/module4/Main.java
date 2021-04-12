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

        LocalDate date = LocalDate.of(2020, 02, 10);
        LocalDateTime start, finish;

        System.out.println("--------------- Consistent way ---------------------");
        start = LocalDateTime.now();
        for (int i = 0; i < 5; i++) {
            LogsService.errorLogsByDateToFile(date.plusDays(i));
        }
        finish = LocalDateTime.now();
        System.out.println("Consistent way done in " + ChronoUnit.MILLIS.between(start, finish) + "ms");
        System.out.println(" ");

        System.out.println("---------------Threads---------------------");

        for (int i = 0; i < 5; i++) {
            new MyThread(date.plusDays(i)).start();
        }

        /*
        ----------------------- OUTPUT -----------------------


        --------------- Consistent way ---------------------
        Consistent way done in 9648ms

        ---------------Threads---------------------
        Thread-1 created in 2021-04-12T20:19:23.441
        Thread-2 created in 2021-04-12T20:19:23.441
        Thread-0 created in 2021-04-12T20:19:23.441
        Thread-3 created in 2021-04-12T20:19:23.443
        Thread-4 created in 2021-04-12T20:19:23.443
        Thread-1 - 3452ms
        Thread-1 finished in 2021-04-12T20:19:26.893
        Thread-3 - 3520ms
        Thread-3 finished in 2021-04-12T20:19:26.963
        Thread-2 - 3607ms
        Thread-2 finished in 2021-04-12T20:19:27.048
        Thread-4 - 3639ms
        Thread-4 finished in 2021-04-12T20:19:27.082
        Thread-0 - 3647ms
        Thread-0 finished in 2021-04-12T20:19:27.088

        Time of Consistent way work is 9648ms
        Time of Thread way work is about 3.5 seconds which is 3500ms

        ----- Thread way is much faster -----
        */


    }
}