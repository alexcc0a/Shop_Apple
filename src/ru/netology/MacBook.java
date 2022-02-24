package ru.netology;

public class MacBook extends Product implements Food {
    private final String name = "MacBook";
    private final int price = 129000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Компьютер включен");
    }
}