package com.company;

public class Perfume extends Goods {

    public Perfume(String name, String code, Integer quantity, Double price) {
        super(name, code, quantity, price);
    }

    @Override
    String category() {
        return "Perfume";
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
