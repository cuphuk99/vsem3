package Ish.edu.collections.lab2;

import Ish.edu.collections.lab2.interfaces.IBookkeeping;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem3
 * @class SugarPacked
 * @since 31.03.2021 - 20.18
 */

public class SugarPacked implements IBookkeeping {
    private Name name;
    private double quantity;        // the quantity of sugar packs for 1 order
    private double price;           // per 1 pack of sugar
    private double priceWholesale;  // price per 1kg of sugar but for the orders more than 50 packs
    private boolean delivery;       //does client include the delivery to the order
    private int amount;             // the amount of all orders by this position

    public SugarPacked() {
    }

    public SugarPacked(Name name, double quantity, double price, double priceWholesale, int amount) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.priceWholesale = priceWholesale;
        this.amount = amount;
    }

    public SugarPacked(Name name, double quantity, double price, double priceWholesale, boolean delivery, int amount) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.priceWholesale = priceWholesale;
        this.delivery = delivery;
        this.amount = amount;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "SugarPacked{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", priceWholesale=" + priceWholesale +
                ", amount=" + amount +
                '}';
    }

    @Override
    public double getPriceOfOrder() {
        double currentPrice = this.getQuantity() < 50 ? this.getPrice() : this.getPriceWholesale();
        return ((this.getQuantity() * currentPrice + getDeliveryPrice()) * this.getAmount());
    }

    @Override
    public double getDeliveryPrice() {
        double delivelyPrice = 0;
        if (this.isDelivery()){
            // free delivery for the orders with quantity more that 200 packs
            // price of delivery for orders with weight less that 200 packs is 5% from the order price
            delivelyPrice = this.getQuantity() > 200 ? 0 : this.getQuantity() * 0.05;
        } else {
            delivelyPrice = 0;
        }
        return delivelyPrice;
    }
}