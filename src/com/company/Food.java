package com.company;

public class Food extends Goods {

    public Food(String name, String code, Integer quantity, Double price) {
        super(name, code, quantity, price);
    }

    @Override
    String category() {
        return "Food";
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
