package Ish.edu.collections.lab2;

import Ish.edu.collections.ArraysTest;
import Ish.edu.collections.lab2.interfaces.IBookkeeping;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class Main
 * @since 31.03.2021 - 20.17
 */

public class Main {
    public static void main(String[] args) {
        List<IBookkeeping> list = new ArrayList<>(
                Arrays.asList(
                        new SugarOnWeight(Name.WhiteSugar, 5.00, 0.80, 15, 12, true, 6),
                        new SugarOnWeight(Name.BrownSugar, 55.00, 1.5, 29.99, 20, true, 1),
                        new SugarOnWeight(Name.CaneSugar, 9.50, 2.50, 110.15, 99.99, false, 4),
                        new SugarOnWeight(Name.CoconutSugar, 11.00, 5.5, 205.89, 12, true, 10),
                        new SugarOnWeight(Name.VanillaSugar, 7.50, 1.00, 18.90, 12, false, 15),
                        new SugarPacked (Name.LumpSugar, 20, 19.99, 15.99, false, 3),
                        new SugarPacked (Name.WhiteSugar, 250, 13.99, 11.50, true, 21),
                        new SugarPacked (Name.SweetFamily, 57, 24.99, 21.50, true, 10),
                        new SugarPacked (Name.Hutorok, 40, 20.00, 18.25, false, 15),
                        new SugarPacked (Name.CoconutSugar, 90, 17.25, 14.99, false, 9)

                )
        );
        double totalIncome = list.stream().mapToDouble(IBookkeeping::getPriceOfOrder).sum();
        double expensive   = list.stream().mapToDouble(IBookkeeping::getPriceOfOrder).max().getAsDouble();
        double cheap       = list.stream().mapToDouble(IBookkeeping::getPriceOfOrder).min().getAsDouble();
        System.out.println(totalIncome);
        System.out.println(expensive);
        System.out.println(cheap);
        //System.out.println(list.stream().filter(item -> item.getPriceOfOrder()==expensive));
        //System.out.println(list.stream().filter(item -> item.getPriceOfOrder()==cheap));
    }
}