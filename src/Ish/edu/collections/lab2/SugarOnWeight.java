package Ish.edu.collections.lab2;

import Ish.edu.collections.lab2.interfaces.IBookkeeping;
import Ish.edu.collections.lab2.interfaces.TypeOfPacking;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class SugarOnWeight
 * @since 31.03.2021 - 20.18
 */

public class SugarOnWeight implements IBookkeeping {
    //private String name;
    private String name;
    private double weight;
    private double priceOfPacking;
    private double price;           // per 1 kg of sugar
    private double priceWholesale;  // price per 1kg of sugar but for the orders more than 10kg
    private boolean delivery;       //does client include the delivery to the order
    private int amount;             // the amount of all orders by this position
    private TypeOfPacking type;

    public SugarOnWeight() {
    }



    public SugarOnWeight(String name, double weight, double priceOfPacking, double price, double priceWholesale, boolean delivery, int amount) {
        this.name = name;
        this.weight = weight;
        this.priceOfPacking = priceOfPacking;
        this.price = price;
        this.priceWholesale = priceWholesale;
        this.delivery = delivery;
        this.amount = amount;
    }

    public SugarOnWeight(String name, double weight, double priceOfPacking, double price, double priceWholesale, boolean delivery, int amount, TypeOfPacking type) {
        this.name = name;
        this.weight = weight;
        this.priceOfPacking = priceOfPacking;
        this.price = price;
        this.priceWholesale = priceWholesale;
        this.delivery = delivery;
        this.amount = amount;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPriceOfPacking() {
        return priceOfPacking;
    }

    public void setPriceOfPacking(double priceOfPacking) {
        this.priceOfPacking = priceOfPacking;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceWholesale() {
        return priceWholesale;
    }

    public void setPriceWholesale(double priceWholesale) {
        this.priceWholesale = priceWholesale;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public TypeOfPacking getType() {
        return type;
    }

    public void setType(TypeOfPacking type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SugarOnWeight{" +
                "name=" + name +
                ", weight=" + weight +
                ", priceOfPacking=" + priceOfPacking +
                ", price=" + price +
                ", priceWholesale=" + priceWholesale +
                ", delivery=" + delivery +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }

    public double getPriceOfOrder(){
        double currentPrice = 0;
        if (this.getWeight()<10){
            currentPrice = this.getPrice();
        } else{
            currentPrice = this.getPriceWholesale();
        }

        return ((this.getWeight() * currentPrice + this.getPriceOfPacking() + getDeliveryPrice()) * this.getAmount());
    }

    @Override
    public double getDeliveryPrice() {
        double delivelyPrice = 0;
        if (this.isDelivery()){
            // free delivery for the orders with weight more that 50kg
            // price of delivery for orders with weight less that 50kg is 5% from the order price
            delivelyPrice = this.getWeight() > 50 ? 0 : this.getWeight() * 0.05;
        } else {
            delivelyPrice = 0;
        }
        return delivelyPrice;
    }

    @Override
    public TypeOfPacking getTypeOfPacking() {
       return  this.getType();
    }
}