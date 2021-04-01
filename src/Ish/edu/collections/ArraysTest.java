package Ish.edu.collections;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class Arrays
 * @since 29.03.2021 - 19.27
 */

public class ArraysTest {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arrayInt = new int[5];
        arrayInt[0] = 2;
        arrayInt[1] = 3;
        arrayInt[2] = 6;
        arrayInt[3] = 8;
        arrayInt[4] = 22;

        System.out.println(arrayInt[2]);
        java.util.Arrays.sort(arrayInt);

        for (int i = 0; i < 5; i++) {
            System.out.println(arrayInt[i]);
        }

        List<Integer> l2 = new ArrayList<>(
                java.util.Arrays.asList(6, 7, 343, 6)
        );

        List<Integer> l3 = Stream.of(1,22,33).collect(Collectors.toList());
        //-------------------------------------


        //CRUD create - add()    read - get()    update      delete - remove()

        List<Integer> listInt = new ArrayList<>();

        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            listInt.add(random.nextInt(1000));
        }
        LocalDateTime finish = LocalDateTime.now();
        int duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println(duration);
        List<Integer> linkedList = new LinkedList<>();

        LocalDateTime start1 = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(1000));
        }
        LocalDateTime finish1 = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start1, finish1);
        System.out.println(duration);

    }

}