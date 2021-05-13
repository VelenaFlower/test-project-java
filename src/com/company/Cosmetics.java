package com.company;

public class Cosmetics extends Goods {

    public Cosmetics(String name, String code, Integer quantity, Double price) {
        super(name, code, quantity, price);
    }

    @Override
    String category() {
        return "Cosmetics";
    }

    @Override
    public int compareTo(Goods someGoods) {
        return super.compareTo(someGoods);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
