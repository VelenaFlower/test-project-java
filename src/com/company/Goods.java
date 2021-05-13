package com.company;

public abstract class Goods implements Comparable<Goods> {

   private String name;
   private String code;
   private Integer quantity;
   private Double price;

   public Goods(String name, String code, Integer quantity, Double price) {
      this.name = name;
      this.code = code;
      this.quantity = quantity;
      this.price = price;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
     this.name = name;
   }

   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public Integer getQuantity() {
      return quantity;
   }

   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   public Double getPrice() {
      return price;
   }

   public void setPrice(Double price) {
      this.price = price;
   }

   abstract String category();

   @Override
   public int compareTo(Goods someGoods) {
      if (this.getQuantity() < someGoods.getQuantity()) {
         return -1;
      } else {
         return 1;
      }
   }

   @Override
   public String toString() {
      String sb;
      sb = category() + " {" + "name: " + getName() +
              ", vendor code: " + getCode() +
              ", quantity: " + getQuantity() +
              ", price: " + getPrice() + " BYN" +
              "}";
      return sb;
   }

   public double cost() {
      return quantity * price;
   }
}
