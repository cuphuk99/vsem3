package Ish.edu.collections.lab2;

import Ish.edu.collections.lab2.interfaces.IBookkeeping;

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
                        new SugarOnWeight("WhiteSugar", 5.00, 0.80, 15, 12, true, 6),
                        new SugarOnWeight("BrownSugar", 55.00, 1.5, 29.99, 20, true, 1),
                        new SugarOnWeight("CaneSugar", 9.50, 2.50, 110.15, 99.99, false, 4),
                        new SugarOnWeight("CoconutSugar", 11.00, 5.5, 205.89, 12, true, 10),
                        new SugarOnWeight("VanillaSugar", 7.50, 1.00, 18.90, 12, false, 15),
                        new SugarPacked ("LumpSugar", 20, 19.99, 15.99, false, 3),
                        new SugarPacked ("WhiteSugar", 250, 13.99, 11.50, true, 21),
                        new SugarPacked ("SweetFamily", 57, 24.99, 21.50, true, 10),
                        new SugarPacked ("Hutorok", 40, 20.00, 18.25, false, 15),
                        new SugarPacked ("CoconutSugar", 90, 17.25, 14.99, false, 9)

                )
        );
        double totalIncome = list.stream().mapToDouble(IBookkeeping::getPriceOfOrder).sum();
        IBookkeeping expensive   = list.stream().max(Comparator.comparing(IBookkeeping::getPriceOfOrder)).get();
        IBookkeeping cheapest   = list.stream().min(Comparator.comparing(IBookkeeping::getPriceOfOrder)).get();
        double avg = list.stream().mapToDouble(IBookkeeping::getPriceOfOrder).average().getAsDouble();

        double totalIncomePacked = list.stream().filter(el -> el instanceof SugarPacked)
                .mapToDouble(IBookkeeping::getPriceOfOrder).sum();

        double totalIncomeOnWeight = list.stream().filter(el -> el instanceof SugarOnWeight)
                .mapToDouble(IBookkeeping::getPriceOfOrder).sum();

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
        System.out.println("It brings the " + expensive.getPriceOfOrder() + " UAH.");
        System.out.println("------------------------------------");
        System.out.println("The less profitable good is " + cheapest);
        System.out.println("It brings the " + cheapest.getPriceOfOrder() + " UAH.");
        System.out.println("------------------------------------");
        System.out.println("The total profit from packed sugar is " + totalIncomePacked);
        System.out.println("------------------------------------");
        System.out.println("The total profit from on weigh sugar is " + totalIncomeOnWeight);
        System.out.println("------------------------------------");
        System.out.println("So the most profitable type of selling is " + bestType);


        /*
        EXAMPLE

        A company contains two types of employees:  full-time and  part-time ones.
        1. Create two appropriate classes and 5 objects of each one.
        2. Calculate   the total salary of a month.
        3. Find the highest salary employee.
        4. Find he lowest salary employee
        5.  The average salary.
        6. Who get more salary, part-time or full-time employees?

        But I have changed it for my own task so the subtasks is:

        1. Create two appropriate classes and 5 objects of each one.
        2. Calculate  the total profit of a month.
        3. Find the most profitable product.
        4. Find the most profitable product.
        5. The average profit for month.
        6. Which type of selling (packed sugar or on weight) is more profitable?
        ---------------------------------------------------------------------------
        */

        /*
        Total income profit is 107275.05
        ------------------------------------
        Average profit is 10727.50
        ------------------------------------
        The most profitable good is SugarPacked{name=WhiteSugar, quantity=250.0, price=13.99, priceWholesale=11.5, delivery=true, amount=21, type=Packed}
        It brings the 60375.0 UAH.
        ------------------------------------
        The less profitable good is SugarOnWeight{name=WhiteSugar, weight=5.0, priceOfPacking=0.8, price=15.0, priceWholesale=12.0, delivery=true, amount=6, type=OnWeight}
        The less profitable good is 456.30 UAH.
        ------------------------------------
        The total profit from packed sugar is 97999.8
        ------------------------------------
        The total profit from on weigh sugar is 9275.25
        ------------------------------------
        So the most profitable type of selling is packed sugar.
        */
    }
}