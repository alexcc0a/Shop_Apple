package ru.netology;

public class IPod extends Product implements Food {
    private final String name = "iPod";
    private final int price = 16990;

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
        System.out.println("Плеер включен");
    }
}