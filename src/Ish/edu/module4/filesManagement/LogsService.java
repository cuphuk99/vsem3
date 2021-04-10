package Ish.edu.module4.filesManagement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class LogsService
 * @since 10.04.2021 - 15.02
 */

public class LogsService {
    private String path;

    public LogsService() {
    }

    public String getFile() {
        return path;
    }

    public void setFile(String path) {
        this.path = path;
    }

    // count the amount of logs in file
    public static int logsAmount(String path) throws IOException {
        List<String> list = Files.lines(Paths.get(path))
                .collect(Collectors.toList());
        return list.size();
    }

    // count the ERROR logs with the Split method
    public static int errorsAmountBySplit(String path) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get(path)));
        String[] array = text.split("\n");
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].contains("ERROR")){
                counter++;
            }
        }
        return counter;
    }

    // count the ERROR logs with the Files.lines
    public static int errorsAmountByLines(String path) throws IOException {
        List<String> list = Files.lines(Paths.get(path)).filter(er -> er.contains("ERROR"))
                .collect(Collectors.toList());
        return list.size();
    }
}