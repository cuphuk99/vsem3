package Ish.edu.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class Cols
 * @since 31.03.2021 - 19.00
 */

public class Cols {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
                Arrays.asList(12,23,54,666,8)
        );
        int sum = list.stream().mapToInt(Integer::intValue).sum();



    }
}