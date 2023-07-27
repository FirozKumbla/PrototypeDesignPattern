package com.example.one;

public class LearnPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Master");
        bs.loadData();

        BookShop bs1 =  bs.clone();
        bs.getBookList().remove(2);
        bs1.setShopName("XYZ");

        System.out.println(bs);
        System.out.println(bs1);
    }
}
