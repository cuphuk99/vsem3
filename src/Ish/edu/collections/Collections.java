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

        start = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(1000));
        }
        finish = LocalDateTime.now();
        int durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of LinkedList is " + durationLinked);
        System.out.println("-------------------------------------");

        if (durationLinked > duration){
            System.out.println("ArrayList creates faster");
        } else {
            System.out.println("LinkedList creates faster");
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println(" ");

        // END OF 1 TASK
        // THE Array List - listInt DURATION OF CREATION IS 419
        // THE linkedList DURATION OF CREATION IS 37
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        //-----------------------------------------------------------------------------------

        // TASK 2 INSERTION
        // INSERTION FROM BEGINNING

        // FOR ArrayList - listInt

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            listInt.add(0, random.nextInt(1000));
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList insertion from beginning is " + duration);
        System.out.println("-------------------------------------");

        // FOR linkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, random.nextInt(1000));
        }

        finish = LocalDateTime.now();
        durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("duration of LinkedList insertion from beginning is " + durationLinked);
        System.out.println("-----------------------------------------------");
        if (durationLinked > duration){
            System.out.println("ArrayList insertion from beginning is faster");
        } else {
            System.out.println("LinkedList insertion from beginning is faster");
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");



        // THE Array List - listInt DURATION OF INSERTION FROM BEGINNING IS 242
        // THE linkedList DURATION OF INSERTION FROM BEGINNING IS 5
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        // INSERTION FROM END
        // FOR ArrayList - listInt

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            listInt.add(random.nextInt(1000));
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList insertion from end is " + duration);
        System.out.println("-------------------------------------");


        // FOR linkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(random.nextInt(1000));
        }

        finish = LocalDateTime.now();
        durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("duration of LinkedList insertion from end is " + durationLinked);
        System.out.println("------------------------------------------------------------------");
        if (durationLinked > duration){
            System.out.println("ArrayList insertion from end is faster");
        } else {
            System.out.println("LinkedList insertion from end is faster");
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");


        // THE Array List - listInt DURATION OF INSERTION FROM BEGINNING IS 1
        // THE linkedList DURATION OF INSERTION FROM BEGINNING IS 3
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        // INSERTION FROM END
        // FOR ArrayList - listInt
        int listIntMiddleIndex = listInt.size()/2;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            listInt.add(listIntMiddleIndex, random.nextInt(1000));
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList insertion from middle is " + duration);
        System.out.println("-------------------------------------");


        // FOR linkedList
        int linkedListMiddleIndex = linkedList.size()/2;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedListMiddleIndex, random.nextInt(1000));
        }

        finish = LocalDateTime.now();
        durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of LinkedList insertion from middle is " + durationLinked);
        System.out.println("---------------------------------------------------------------");

        if (durationLinked > duration){
            System.out.println("ArrayList insertion from middle is faster");
        } else {
            System.out.println("LinkedList insertion from middle is faster");
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");

        // THE Array List - listInt DURATION OF INSERTION FROM BEGINNING IS 1
        // THE linkedList DURATION OF INSERTION FROM BEGINNING IS 3
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        //-----------------------------------
        // END OF THE TASK 2
        //-----------------------------------
    }
}