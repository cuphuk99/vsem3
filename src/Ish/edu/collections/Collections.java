package Ish.edu.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class Collections
 * @since 29.03.2021 - 19.49
 */

public class Collections {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> listInt = new ArrayList<>();

        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            listInt.add(random.nextInt(1000));
        }

        LocalDateTime finish = LocalDateTime.now();
        int duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList is " + duration);
        System.out.println("-------------------------------------");

        List<Integer> linkedList = new LinkedList<>();

        LocalDateTime start1 = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(1000));
        }
        LocalDateTime finish1 = LocalDateTime.now();
        int durationLinked = (int) ChronoUnit.MILLIS.between(start1, finish1);
        System.out.println("duration of LinkedList is " + durationLinked);
        System.out.println("-------------------------------------");

        if (durationLinked > duration){
            System.out.println("ArrayList creates faster");
        } else {
            System.out.println("LinkedList creates faster");
        }
        System.out.println("-------------------------------------");


    }
}