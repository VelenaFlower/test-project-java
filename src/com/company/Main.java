package com.company;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Cosmetics shampoo = new Cosmetics("Trichup Black seeds", "Y001", 5, 5.50);
        Cosmetics toothPaste = new Cosmetics("Dabur Red", "U009", 24, 3.00);
        Cosmetics cream = new Cosmetics("Day 2 Day Sandal", "S016", 12, 2.50);
        Cosmetics hairColor = new Cosmetics("Color Mate 9.1 Black", "A001", 18, 10.40);
        Cosmetics bodyOil = new Cosmetics("Coconut Oil Parashute", "E002", 96, 5.78);
        Perfume perfumeOil = new Perfume("Lovely Al-Rehab", "AT023", 18, 5.88);
        Perfume perfumeWater = new Perfume("Devotion Chris Adams", "AR013", 7, 15.65);
        Food sweet = new Food("Soan Papdi Desi Ghee", "BA011", 8, 8.56);
        Food spice = new Food("Curry powder Narpa", "BI023", 144, 1.56);
        Food tea = new Food("Green tea TinGree Maharaja", "BL020", 48, 6.00);

        TreeSet<Goods> myCosmeticsTreeSet = new TreeSet<>(); // TreeSet для сортировки по количеству (Comparable)

        myCosmeticsTreeSet.add(shampoo);
        myCosmeticsTreeSet.add(toothPaste);
        myCosmeticsTreeSet.add(cream);
        myCosmeticsTreeSet.add(hairColor);
        myCosmeticsTreeSet.add(bodyOil);
        myCosmeticsTreeSet.add(perfumeOil);
        myCosmeticsTreeSet.add(perfumeWater);
        myCosmeticsTreeSet.add(sweet);
        myCosmeticsTreeSet.add(spice);
        myCosmeticsTreeSet.add(tea);

        System.out.println("Sorted for quantity: ");
        for (Goods q: myCosmeticsTreeSet) {
            System.out.println(q);
        }
        // изменить значения
        bodyOil.setName("Coconut Oil Parashute 200ml");
        tea.setPrice(6.05);
        perfumeOil.setQuantity(36);
        cream.setCode("S025");

        ArrayList<Goods> myCosmeticsArrayList = new ArrayList<>(); // ArrayList для сортировки по цене (Comparator)

        myCosmeticsArrayList.add(shampoo);
        myCosmeticsArrayList.add(toothPaste);
        myCosmeticsArrayList.add(cream);
        myCosmeticsArrayList.add(hairColor);
        myCosmeticsArrayList.add(bodyOil);
        myCosmeticsArrayList.add(perfumeOil);
        myCosmeticsArrayList.add(perfumeWater);
        myCosmeticsArrayList.add(sweet);
        myCosmeticsArrayList.add(spice);
        myCosmeticsArrayList.add(tea);

        PriceComparator myPriceComparator = new PriceComparator();
        myCosmeticsArrayList.sort(myPriceComparator);

        System.out.println("Sorted for price: ");
        for (Goods p: myCosmeticsArrayList) {
            System.out.println(p);
        }

        System.out.println("Товара " + shampoo.getName() + " на сумму: " + shampoo.cost() + " BYN");
    }
}
