package com.company;

import java.util.Comparator;

public class PriceComparator implements Comparator<Goods> {
    public int compare(Goods g1, Goods g2) {
        if (g1.getPrice().equals(g2.getPrice())) {
        return 0;
    }
        if (g1.getPrice() > g2.getPrice()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
