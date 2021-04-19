package Ish.edu.module4.test;

import java.util.Arrays;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class RightShift
 * @since 19.04.2021 - 18.47
 */

public class RightShift {
    public static int[] rightShift(int[] array, int step){
        int[] newArray = new int[array.length];
        int newIndex = 0;
        int newStep = 0;
        if (step >= array.length){
            newStep = step % array.length;
        } else {
            newStep = step;
        }

        for (int i = 0; i < array.length; i++) {
            newIndex = i+newStep;
            if (i+newStep >= array.length){
                newIndex = i+newStep - array.length;
            }
            newArray[newIndex] = array[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        System.out.println(Arrays.toString(rightShift(array2, 21))); // [50, 10, 20, 30, 40]
    }
}