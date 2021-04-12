package Ish.edu.module4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class LogsService
 * @since 09.04.2021 - 18.31
 */

public class LogsService {
    private final String file = "D:\\BestBrain\\Java kurs\\logs.txt";

    public LogsService() {
    }

    public String getFile() {
        return file;
    }

    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
        String dateAsString = date.toString();

        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());

        return list;
    }

    public static void getLogsCountByDate(LocalDate date) throws IOException {
        String dateAsString = date.toString();
        String file = "D:\\BestBrain\\Java kurs\\logs.txt";
        System.out.println(date + " - " + Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString)).count() + " logs per day");
    }

    public static void errorLogsByDateToFile(LocalDate date) throws IOException {
        String dateAsString = date.toString();
        String str = "";
        String file = "D:\\BestBrain\\Java kurs\\logs.txt";
        StringBuilder sb = new StringBuilder(str);
        Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .filter(log -> log.contains("ERROR"))
                .forEach(log -> sb.append(log + "\n"));


        String output = "D:\\BestBrain\\Java kurs\\" + "ERROR" + dateAsString + ".log";
        Files.write(Paths.get(output), sb.toString().getBytes(StandardCharsets.UTF_8));
    }
}