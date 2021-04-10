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
    private String file;

    public LogsService() {
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
        String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());

        return list;
    }
    public static void logsByDateToFile(String file, LocalDate date) throws IOException {
        String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());
        String str = "";

        for(String log: list){
            str +=  log + System.lineSeparator() ;
        }

        String output = "D:\\BestBrain\\Java kurs\\" + "ERROR" + dateAsString + ".log";
        Files.write(Paths.get(output), str.getBytes(StandardCharsets.UTF_8));
    }
}