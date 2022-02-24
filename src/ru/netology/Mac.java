package ru.netology;

public class Mac extends Product implements Electronics {
    private final String name = "Mac";
    private final int price = 180000;

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