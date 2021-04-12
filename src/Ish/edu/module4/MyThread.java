package Ish.edu.module4;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class MyThread
 * @since 12.04.2021 - 18.40
 */

public class MyThread extends Thread{
    private LocalDate date;

    public MyThread(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void run() {

        LocalDateTime start = LocalDateTime.now();
        System.out.println(this.getName() + " created in " + start);
        try {
            LogsService.errorLogsByDateToFile(this.getDate());
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(this.getName() + " - " + ChronoUnit.MILLIS.between(start, finish) + "ms");
        System.out.println(this.getName() + " finished in " + finish);
    }
}