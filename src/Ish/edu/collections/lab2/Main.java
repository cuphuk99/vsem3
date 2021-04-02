package Ish.edu.collections.lab2;

import Ish.edu.collections.ArraysTest;
import Ish.edu.collections.lab2.interfaces.IBookkeeping;
import Ish.edu.collections.lab2.interfaces.TypeOfPacking;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class Main
 * @since 31.03.2021 - 20.17
 */
// Subjects according to my number 4 is "Sugar packed and by weight"

public class Main {
    public static void main(String[] args) {
        List<IBookkeeping> list = new ArrayList<>(
                Arrays.asList(
                        new SugarOnWeight("WhiteSugar", 5.00, 0.80, 15, 12, true, 6, TypeOfPacking.OnWeight),
                        new SugarOnWeight("BrownSugar", 55.00, 1.5, 29.99, 20, true, 1, TypeOfPacking.OnWeight),
                        new SugarOnWeight("CaneSugar", 9.50, 2.50, 110.15, 99.99, false, 4, TypeOfPacking.OnWeight),
                        new SugarOnWeight("CoconutSugar", 11.00, 5.5, 205.89, 12, true, 10, TypeOfPacking.OnWeight),
                        new SugarOnWeight("VanillaSugar", 7.50, 1.00, 18.90, 12, false, 15, TypeOfPacking.OnWeight),
                        new SugarPacked ("LumpSugar", 20, 19.99, 15.99, false, 3, TypeOfPacking.Packed),
                        new SugarPacked ("WhiteSugar", 250, 13.99, 11.50, true, 21, TypeOfPacking.Packed),
                        new SugarPacked ("SweetFamily", 57, 24.99, 21.50, true, 10, TypeOfPacking.Packed),
                        new SugarPacked ("Hutorok", 40, 20.00, 18.25, false, 15, TypeOfPacking.Packed),
                        new SugarPacked ("CoconutSugar", 90, 17.25, 14.99, false, 9, TypeOfPacking.Packed)

                )
        );
        double totalIncome = list.stream().mapToDouble(IBookkeeping::getPriceOfOrder).sum();
        IBookkeeping expensive   = list.stream().max(Comparator.comparing(IBookkeeping::getPriceOfOrder)).get();
        IBookkeeping cheapest   = list.stream().min(Comparator.comparing(IBookkeeping::getPriceOfOrder)).get();
        double avg = list.stream().mapToDouble(IBookkeeping::getPriceOfOrder).average().getAsDouble();

        List<IBookkeeping>  sugarPacked = list.stream().filter(item -> item.getTypeOfPacking() == TypeOfPacking.Packed)
                                .collect(Collectors.toList());
        List<IBookkeeping>  sugarOnWeight = list.stream().filter(item -> item.getTypeOfPacking() == TypeOfPacking.OnWeight)
                                .collect(Collectors.toList());

        double totalIncomePacked = sugarPacked.stream().mapToDouble(IBookkeeping::getPriceOfOrder).sum();
        double totalIncomeOnWeight = sugarOnWeight.stream().mapToDouble(IBookkeeping::getPriceOfOrder).sum();
        String bestType = "";
        if (totalIncomePacked > totalIncomeOnWeight){
            bestType = "packed sugar.";
        } else {
            bestType = "on weight sugar.";
        }

        System.out.println("Total income profit is " + totalIncome);
        System.out.println("------------------------------------");
        System.out.println("Average profit is " + avg);
        System.out.println("------------------------------------");
        System.out.println("The most profitable good is " + expensive);
        System.out.println("------------------------------------");
        System.out.println("The less profitable good is " + cheapest);
        System.out.println("------------------------------------");
        System.out.println("The total profit from packed sugar is " + totalIncomePacked);
        System.out.println("------------------------------------");
        System.out.println("The total profit from on weigh sugar is " + totalIncomeOnWeight);
        System.out.println("------------------------------------");
        System.out.println("So the most profitable type of selling is " + bestType);

    }
}