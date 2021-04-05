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

        System.out.println("duration of ArrayList creation is " + duration);
        System.out.println("-------------------------------------");

        List<Integer> linkedList = new LinkedList<>();

        start = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(1000));
        }
        finish = LocalDateTime.now();
        int durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of LinkedList creation is " + durationLinked);
        System.out.println("-------------------------------------");

        if (durationLinked > duration){
            System.out.println("ArrayList creates faster");
        } else {
            System.out.println("LinkedList creates faster");
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println(" ");

        // END OF 1 TASK
        // THE Array List - listInt DURATION OF CREATION IS 323
        // THE linkedList DURATION OF CREATION IS 116
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        //-----------------------------------------------------------------------------------

        // ----------------------------- TASK 2 INSERTION -----------------------------

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
        // LinkedList insertion from beginning is faster
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        // INSERTION FROM END
        // FOR ArrayList - listInt

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            listInt.add(listInt.size()-1, random.nextInt(1000));
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList insertion from end is " + duration);
        System.out.println("-------------------------------------");


        // FOR linkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size()-1,random.nextInt(1000));
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


        // THE Array List - listInt DURATION OF INSERTION FROM END IS 1
        // THE linkedList DURATION OF INSERTION FROM END IS 3
        // LinkedList insertion from end is faster
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        // INSERTION FROM MIDDLE
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

        // THE Array List - listInt DURATION OF INSERTION FROM MIDDLE IS 67
        // THE linkedList DURATION OF INSERTION FROM MIDDLE IS 889
        // ArrayList insertion from middle is faster
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        //-----------------------------------
        // END OF THE TASK 2
        //-----------------------------------

        //*****************************************************************************
        // --------------------------- TASK 3 UPDATE --------------------------
        // UPDATE FROM BEGINNING

        // FOR ArrayList - listInt

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            listInt.set(i, i);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList update from beginning is " + duration);
        System.out.println("-------------------------------------");

        // FOR linkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(i, i);
        }

        finish = LocalDateTime.now();
        durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("duration of LinkedList update from beginning is " + durationLinked);
        System.out.println("-----------------------------------------------");
        if (durationLinked > duration){
            System.out.println("ArrayList update from beginning is faster");
        } else {
            System.out.println("LinkedList update from beginning is faster");
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");



        // THE Array List - listInt DURATION OF UPDATE FROM BEGINNING IS 7
        // THE linkedList DURATION OF UPDATE FROM BEGINNING IS 182
        // ArrayList update from beginning is faster
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        // UPDATE FROM END
        // FOR ArrayList - listInt

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            listInt.set(listInt.size() - 1, i);
        }
        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList update from end is " + duration);
        System.out.println("-------------------------------------");


        // FOR linkedList

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size() - 1, i);
        }
        finish = LocalDateTime.now();
        durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("duration of LinkedList update from end is " + durationLinked);
        System.out.println("---------------------------------------------------");

        if (durationLinked > duration){
            System.out.println("ArrayList update from end is faster");
        } else {
            System.out.println("LinkedList update from end is faster");
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");


        // THE Array List - listInt DURATION OF UPDATE FROM END IS 2
        // THE linkedList DURATION OF UPDATE FROM END IS 29
        // ArrayList update from end is faster
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        // UPDATE FROM MIDDLE
        // FOR ArrayList - listInt
        listIntMiddleIndex = listInt.size()/2 - 500;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            listInt.set(listIntMiddleIndex, i);
            listIntMiddleIndex++;
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList update from middle is " + duration);
        System.out.println("-------------------------------------");


        // FOR linkedList
        linkedListMiddleIndex = linkedList.size()/2 - 500;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedListMiddleIndex, i);
            linkedListMiddleIndex++;
        }

        finish = LocalDateTime.now();
        durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of LinkedList update from middle is " + durationLinked);
        System.out.println("---------------------------------------------");

        if (durationLinked > duration){
            System.out.println("ArrayList update from middle is faster");
        } else {
            System.out.println("LinkedList update from middle is faster");
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");

        // THE Array List - listInt DURATION OF UPDATE FROM MIDDLE IS 105
        // THE linkedList DURATION OF UPDATE FROM MIDDLE IS 1021
        // ArrayList update from middle is faster
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        //-----------------------------------
        // END OF THE TASK 3
        //-----------------------------------

        //*****************************************************************************
        // --------------------------- TASK 4 REMOVE  --------------------------

        // REMOVING FROM BEGINNING
        // FOR ArrayList - listInt

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            listInt.remove(0);

        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList removing from beginning is " + duration);
        System.out.println("-------------------------------------");

        // FOR linkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(0);
        }

        finish = LocalDateTime.now();
        durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("duration of LinkedList removing from beginning is " + durationLinked);
        System.out.println("-----------------------------------------------");
        if (durationLinked > duration){
            System.out.println("ArrayList removing from beginning is faster");
        } else {
            System.out.println("LinkedList removing from beginning is faster");
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");



        // THE Array List - listInt DURATION OF REMOVING FROM BEGINNING IS 118
        // THE linkedList DURATION OF REMOVING FROM BEGINNING IS 1
        // LinkedList removing from beginning is faster
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        // REMOVE FROM END
        // FOR ArrayList - listInt

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            listInt.remove(listInt.size()-1);

        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList removing from end is " + duration);
        System.out.println("-------------------------------------");


        // FOR linkedList

        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            linkedList.remove(linkedList.size() - 1);
        }

        finish = LocalDateTime.now();
        durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("duration of LinkedList removing from end is " + durationLinked);
        System.out.println("---------------------------------------------------");
        if (durationLinked > duration){
            System.out.println("ArrayList removing from end is faster");
        } else {
            System.out.println("LinkedList removing from end is faster");
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");


        // THE Array List - listInt DURATION OF REMOVING FROM END IS 2
        // THE linkedList DURATION OF REMOVING FROM END IS 1
        // LinkedList removing from end is faster
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        // UPDATE FROM MIDDLE
        // FOR ArrayList - listInt
        listIntMiddleIndex = listInt.size()/2-500;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            listInt.remove(listIntMiddleIndex);
            listIntMiddleIndex++;
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of ArrayList removing from middle is " + duration);
        System.out.println("-------------------------------------");


        // FOR linkedList
        linkedListMiddleIndex = linkedList.size()/2-500;
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedListMiddleIndex);
            linkedListMiddleIndex++;
        }

        finish = LocalDateTime.now();
        durationLinked = (int) ChronoUnit.MILLIS.between(start, finish);

        System.out.println("duration of LinkedList removing from middle is " + durationLinked);
        System.out.println("---------------------------------------------");

        if (durationLinked > duration){
            System.out.println("ArrayList removing from middle is faster");
        } else {
            System.out.println("LinkedList removing from middle is faster");
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println(" ");

        // THE Array List - listInt DURATION OF REMOVING FROM MIDDLE IS 52
        // THE linkedList DURATION OF REMOVING FROM MIDDLE IS 527
        // ArrayList removing from middle is faster
        // MAYBE THATS BECAUSE OF MY OLD LAPTOP

        //-----------------------------------
        // END OF THE TASK 4
        //-----------------------------------

        // ------------------- CONCLUSION ------------------------

        //
        // ----------------- time of creation --------------------------
        //    Array List 323 ms ---------------- Linked list 116 ms


        // ------------------ INSERTION --------------------------

        // ------------------- HEAD ------------------------------
        //    Array List 242 ms ---------------- Linked list 5 ms
        //    Linked list is better

        // ------------------- MIDDLE ------------------------------
        //    Array List 67 ms ---------------- Linked list 889 ms
        //    Array list is MUCH better and faster

        // ------------------- TAIL ------------------------------
        //    Array List 1 ms ---------------- Linked list 3 ms
        //    Both lists are same good




        // ------------------ UPDATE --------------------------

        // ------------------- HEAD ------------------------------
        //    Array List 7 ms ---------------- Linked list 182 ms
        //    Array list is faster

        // ------------------- MIDDLE ------------------------------
        //    Array List 105 ms ---------------- Linked list 1021 ms
        //    Array list is 10 times faster

        // ------------------- TAIL ------------------------------
        //    Array List 2 ms ---------------- Linked list 29 ms
        //    Both lists are almost the same



        // ------------------ REMOVE --------------------------

        // ------------------- HEAD ------------------------------
        //    Array List 118 ms ---------------- Linked list 1 ms
        //    Linked list is better

        // ------------------- MIDDLE ------------------------------
        //    Array List 2 ms ---------------- Linked list 1 ms
        //    Both list are same good

        // ------------------- TAIL ------------------------------
        //    Array List 52 ms ---------------- Linked list 527 ms
        //    Linked list is better and faster
        //
        // Linked list is better in creation, in Insertion from the head,
        // and in Removing from Head

        // Array list is better in Insertion from Middle, Update from Head and Middle,
        // and in Removing from Tail

        // Both lists are same good in Insertion from Tail, Update from tail,
        // and Remove from Middle

    }
}