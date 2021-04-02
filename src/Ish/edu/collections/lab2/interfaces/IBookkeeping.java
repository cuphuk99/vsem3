package Ish.edu.collections.lab2.interfaces;

import Ish.edu.collections.lab2.TypeOfPacking;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class IBookkeeping
 * @since 01.04.2021 - 16.49
 */

public interface IBookkeeping {
    double getPriceOfOrder();
    double getDeliveryPrice();
    TypeOfPacking getTypeOfPacking();
}
