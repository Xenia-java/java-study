package com.zhang.self2;

public class Phone {
    private String bland;
    private int price;
    private String color;

    public Phone() {
    }

    public Phone(String bland, int price, String color) {
        this.bland = bland;
        this.price = price;
        this.color = color;
    }

    public String getBland() {
        return bland;
    }

    public void setBland(String bland) {
        this.bland = bland;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
